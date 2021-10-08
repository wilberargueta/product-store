package com.unicomer.productstore.util.converter;

import com.unicomer.productstore.jpa.entity.ItemsEntity;
import com.unicomer.productstore.rest.model.ItemsModel;

import org.springframework.stereotype.Component;

@Component
public class ItemsConvert extends AbstractConvert<ItemsEntity, ItemsModel> {

    @Override
    public ItemsModel entityToModel(ItemsEntity entity, boolean loadDependency) {
        if (entity == null)
            return null;

        ItemsModel model = new ItemsModel();
        model.setBrand(entity.getBrand());
        model.setColor(entity.getColor());
        model.setDescription(entity.getDescription());
        model.setOnHand(entity.getOnHand());
        model.setOwner(entity.getOwner());
        model.setUpc(entity.getUpc());
        model.setStyle(entity.getStyle());
        model.setStoreId(entity.getId());
        model.setStore(entity.getStore());
        model.setSku(entity.getSku());
        model.setDepartment(entity.getDepartment());

        return model;
    }

    @Override
    public ItemsEntity modelToEntity(ItemsModel model, boolean loadDependency) {
        if (model == null)
            return null;
        ItemsEntity entity = new ItemsEntity();
        entity.setBrand(model.getBrand());
        entity.setColor(model.getColor());
        entity.setDescription(model.getDescription());
        entity.setOnHand(model.getOnHand());
        entity.setOwner(model.getOwner());
        entity.setUpc(model.getUpc());
        entity.setStyle(model.getStyle());
        entity.setId(model.getStoreId());
        entity.setStore(model.getStore());
        entity.setSku(model.getSku());
        entity.setDepartment(model.getDepartment());
        return entity;
    }

}
