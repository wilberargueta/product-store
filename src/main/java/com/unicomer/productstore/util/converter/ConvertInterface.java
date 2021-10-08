package com.unicomer.productstore.util.converter;

import com.unicomer.productstore.jpa.entity.AbstractAuditEntity;

public interface ConvertInterface<M, E extends AbstractAuditEntity> {
    public M entityToModel(E entity, boolean loadDependency);

    public E modelToEntity(M model, boolean loadDependency);

    public M entityToModel(E entity);

    public E modelToEntity(M model);
}
