package com.unicomer.productstore.util.converter;

import java.util.stream.Collectors;

import com.unicomer.productstore.jpa.entity.ItemsAvailabilityEntity;
import com.unicomer.productstore.rest.model.ItemsAvailabilityModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemsAvailabilityConvert extends AbstractConvert<ItemsAvailabilityEntity, ItemsAvailabilityModel> {

    private final ItemsConvert itemsConvert;

    @Autowired
    public ItemsAvailabilityConvert(ItemsConvert itemsConvert) {
        this.itemsConvert = itemsConvert;
    }

    @Override
    public ItemsAvailabilityModel entityToModel(ItemsAvailabilityEntity entity, boolean loadDependency) {
        if (entity == null)
            return null;

        ItemsAvailabilityModel model = new ItemsAvailabilityModel();

        model.setCountryISOCode(entity.getCountryISOCode());
        if (entity.getItems() != null)
            model.setTotalRow(entity.getItems().size());

        if (loadDependency && entity.getItems() != null)
            model.setItems(
                    entity.getItems().stream().map(this.itemsConvert::entityToModel).collect(Collectors.toList()));

        return model;
    }

    @Override
    public ItemsAvailabilityEntity modelToEntity(ItemsAvailabilityModel model, boolean loadDependency) {
        if (model == null)
            return null;
        ItemsAvailabilityEntity entity = new ItemsAvailabilityEntity();

        entity.setCountryISOCode(model.getCountryISOCode());

        if (loadDependency && model.getItems() != null)
            entity.setItems(
                    model.getItems().stream().map(this.itemsConvert::modelToEntity).collect(Collectors.toList()));

        return entity;
    }

}
