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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/items-availability")
@Api(value = "Items-Availability-Controller", description = "Endpoint para consultar de productos")
public class ItemsAvailabilityController {

    private final ItemsAvailabilityServices itemsAvailabilityServices;

    HttpStatus httpStatus = HttpStatus.OK;

    @Autowired
    public ItemsAvailabilityController(ItemsAvailabilityServices itemsAvailabilityServices) {
        this.itemsAvailabilityServices = itemsAvailabilityServices;
    }

    @PostMapping(path = "/query", consumes = "application/json", produces = "application/json")
    @ApiOperation(notes = "Servicio de consulta de productos", value = "", httpMethod = "POST", consumes = "application/json", produces = "application/json", tags = "getItemsAvailabilityQuery")
    public ResponseEntity<ResponseObject<ItemsAvailabilityModel>> getItemsAvailabilityQuery(
            @RequestBody Map<String, String> queryMap) {
        ResponseObject<ItemsAvailabilityModel> response = new ResponseObject<>();
        response.setOK(true);
        response.setItemAvailability(this.itemsAvailabilityServices.findByQueryMap(queryMap));
        return new ResponseEntity<ResponseObject<ItemsAvailabilityModel>>(response, httpStatus);
    }

}
