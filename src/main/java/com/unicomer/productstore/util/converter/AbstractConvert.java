package com.unicomer.productstore.util.converter;

import com.unicomer.productstore.jpa.entity.AbstractAuditEntity;

public abstract class AbstractConvert<E extends AbstractAuditEntity, M> implements ConvertInterface<M, E> {

    public M entityToModel(E entity) {
        return this.entityToModel(entity, false);
    }

    public E modelToEntity(M model) {
        return this.modelToEntity(model, false);
    }

}
