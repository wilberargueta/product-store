package com.unicomer.productstore.rest.service.impl;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import com.unicomer.productstore.jpa.entity.ItemsAvailabilityEntity;
import com.unicomer.productstore.jpa.repository.ItemsAvailabilityRepository;
import com.unicomer.productstore.jpa.repository.ItemsRepository;
import com.unicomer.productstore.rest.model.ItemsAvailabilityModel;
import com.unicomer.productstore.rest.service.AbstractServices;
import com.unicomer.productstore.rest.service.ItemsAvailabilityServices;
import com.unicomer.productstore.util.converter.ItemsAvailabilityConvert;
import com.unicomer.productstore.util.exceptions.ObjectsNotFoundException;

import org.springframework.stereotype.Service;

@Service
public class ItemsAvailabilityServicesImpl extends
        AbstractServices<ItemsAvailabilityModel, ItemsAvailabilityEntity, ItemsAvailabilityRepository, ItemsAvailabilityConvert>
        implements ItemsAvailabilityServices {

    private final ItemsRepository itemsRepository;

    public ItemsAvailabilityServicesImpl(ItemsAvailabilityRepository repository, ItemsAvailabilityConvert convert,
            ItemsRepository itemsRepository) {
        this.repository = repository;
        this.convert = convert;
        this.itemsRepository = itemsRepository;
    }

    @Override
    public ItemsAvailabilityModel update(ItemsAvailabilityModel model) throws ObjectsNotFoundException {

        return null;
    }

    @Override
    public ItemsAvailabilityModel findByQueryMap(Map<String, String> queryMap) {
        this.logger.debug("QUERY_MAP => {}", queryMap);
        String brand = null;
        String country = null;
        String department = null;
        String store = null;
        String style = null;
        String upc = null;

        for (Entry<String, String> query : queryMap.entrySet()) {
            switch (query.getKey()) {
                case "brand":
                    brand = query.getValue();
                    break;
                case "country":
                    country = query.getValue();
                    break;
                case "department":
                    department = query.getValue();
                    break;
                case "store":
                    store = query.getValue();
                    break;
                case "style":
                    style = query.getValue();
                    break;
                case "upc":
                    upc = query.getValue();
                    break;
                default:
                    break;
            }
        }

        this.logger.debug("PARAMS => brand={}, country={}, department={}, store={}, style={}, upc={}", brand, country,
                department, store, style, upc);

        Optional<ItemsAvailabilityEntity> optional = this.repository
                .findItemsAvailabilityEntityByCountryISOCode(country);

        if (optional.isEmpty())
            return null;

        ItemsAvailabilityEntity availabilityEntity = optional.get();

        availabilityEntity.setItems(
                this.itemsRepository.findItemsEntityQuery(availabilityEntity, brand, department, store, style, upc));
        return this.convert.entityToModel(availabilityEntity, true);
    }

}
