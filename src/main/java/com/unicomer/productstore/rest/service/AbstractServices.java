package com.unicomer.productstore.rest.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.unicomer.productstore.jpa.entity.AbstractAuditEntity;
import com.unicomer.productstore.util.converter.ConvertInterface;
import com.unicomer.productstore.util.exceptions.ObjectsNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractServices<M, E extends AbstractAuditEntity, R extends JpaRepository<E, Long>, C extends ConvertInterface<M, E>>
        implements ServicesInterface<M, E, R, C> {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected R repository;

    protected C convert;

    @Override
    public M save(M model) {
        this.logger.debug("SAVE TABLE");
        return this.convert.entityToModel(this.repository.save(this.convert.modelToEntity(model, true)), true);
    }

    @Override
    public boolean delete(Long id) {

        this.repository.delete(this.convert.modelToEntity(getById(id)));

        return true;
    }

    @Override
    public M getById(Long id) {

        if (id == null)
            throw new ObjectsNotFoundException("No fue posible encontrar el registro.");

        Optional<E> optional = this.repository.findById(id);

        if (!optional.isPresent())
            throw new ObjectsNotFoundException("No fue posible encontrar el registro.");

        return this.convert.entityToModel(optional.get(), true);
    }

    @Override
    public List<M> getAll() {
        return this.repository.findAll().stream().map(e -> this.convert.entityToModel(e, true))
                .collect(Collectors.toList());
    }

}
