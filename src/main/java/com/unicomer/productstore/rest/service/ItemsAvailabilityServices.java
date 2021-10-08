package com.unicomer.productstore.rest.service;

import java.util.Map;

import com.unicomer.productstore.rest.model.ItemsAvailabilityModel;

public interface ItemsAvailabilityServices {

    public ItemsAvailabilityModel findByQueryMap(Map<String, String> queryMap);
}
