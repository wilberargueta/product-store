package com.unicomer.productstore.rest.model;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Clase contenedora con los productos disponibles.")
public class ItemsAvailabilityModel {

	@ApiModelProperty(dataType = "String", example = "SV", notes = "Codigo de pais.", required = true, position = 1)
    private String countryISOCode;
    private int totalRow;
    private List<ItemsModel> items;


    public ItemsAvailabilityModel() {
    }

    public ItemsAvailabilityModel(String countryISOCode, List<ItemsModel> items, int totalRow) {
        this.countryISOCode = countryISOCode;
        this.items = items;
        this.totalRow = totalRow;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public List<ItemsModel> getItems() {
        return items;
    }

    public void setItems(List<ItemsModel> items) {
        this.items = items;
    }

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    @Override
    public String toString() {
        return "ItemsAvailabilityModel [countryISOCode=" + countryISOCode + ", items=" + items + ", totalRow="
                + totalRow + "]";
    }

}
