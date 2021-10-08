package com.unicomer.productstore.rest.service;

import java.util.List;

import com.unicomer.productstore.jpa.entity.AbstractAuditEntity;
import com.unicomer.productstore.util.converter.ConvertInterface;
import com.unicomer.productstore.util.exceptions.ObjectsNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesInterface<M, E extends AbstractAuditEntity, R extends JpaRepository<E, Long>, C extends ConvertInterface<M, E>> {

    public M save(M model);

    public M update(M model) throws ObjectsNotFoundException;

    public boolean delete(Long id) throws ObjectsNotFoundException;

    public M getById(Long id) throws ObjectsNotFoundException;

    public List<M> getAll();
}
