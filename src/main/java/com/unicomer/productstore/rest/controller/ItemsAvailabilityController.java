package com.unicomer.productstore.rest.controller;

import java.util.Map;

import com.unicomer.productstore.rest.model.ItemsAvailabilityModel;
import com.unicomer.productstore.rest.model.ResponseObject;
import com.unicomer.productstore.rest.service.ItemsAvailabilityServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/items-availability")
public class ItemsAvailabilityController {

    private final ItemsAvailabilityServices itemsAvailabilityServices;

    HttpStatus httpStatus = HttpStatus.OK;

    @Autowired
    public ItemsAvailabilityController(ItemsAvailabilityServices itemsAvailabilityServices) {
        this.itemsAvailabilityServices = itemsAvailabilityServices;
    }

    @PostMapping(path = "/query")
    public ResponseEntity<ResponseObject<ItemsAvailabilityModel>> query(@RequestBody Map<String, String> queryMap) {
        ResponseObject<ItemsAvailabilityModel> response = new ResponseObject<>();
        response.setOK(true);
        response.setItemAvailability(this.itemsAvailabilityServices.findByQueryMap(queryMap));
        return new ResponseEntity<ResponseObject<ItemsAvailabilityModel>>(response, httpStatus);
    }

}
