package com.unicomer.productstore.rest.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Productos disponibles por codigo de pais.")
public class ItemsModel {
    @ApiModelProperty(dataType = "Log", example = "1", notes = "ID de la tienda.", required = true, position = 1)
    private Long storeId;
    @ApiModelProperty(dataType = "String", example = "CRC PROCERES", notes = "Nombre de la tienda.", required = true, position = 2)
    private String store;
    @ApiModelProperty(dataType = "Integer", example = "500597", notes = "SKU del producto", required = true, position = 3)
    private Integer sku;
    @ApiModelProperty(dataType = "String", example = "{owner}", notes = "Propietario", required = true, position = 4)
    private String owner;
    @ApiModelProperty(dataType = "String", example = "305", notes = "Departamento del producto", required = true, position = 5)
    private String department;
    @ApiModelProperty(dataType = "String", example = "444666611111", notes = "UPC del producto", required = true, position = 6)
    private String upc;
    @ApiModelProperty(dataType = "String", example = "REFRI 12P SILVER SILVER M", notes = "Descripcion del producto", required = true, position = 7)
    private String description;
    @ApiModelProperty(dataType = "String", example = "000009", notes = "Marca del producto", required = true, position = 8)
    private String brand;
    @ApiModelProperty(dataType = "String", example = "TT32H500JS8", notes = "Estilo del producto", required = true, position = 9)
    private String style;
    @ApiModelProperty(dataType = "String", example = "#ff0412", notes = "Color del producto", required = true, position = 10)
    private String color;
    @ApiModelProperty(dataType = "String", example = "4", notes = "Disponible", required = true, position = 11)
    private String onHand;

    public ItemsModel() {
    }

    public ItemsModel(Long storeId, String store, Integer sku, String owner, String department, String upc,
            String description, String brand, String style, String color, String onHand) {
        this.storeId = storeId;
        this.store = store;
        this.sku = sku;
        this.owner = owner;
        this.department = department;
        this.upc = upc;
        this.description = description;
        this.brand = brand;
        this.style = style;
        this.color = color;
        this.onHand = onHand;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOnHand() {
        return onHand;
    }

    public void setOnHand(String onHand) {
        this.onHand = onHand;
    }

    @Override
    public String toString() {
        return "ProductModel [brand=" + brand + ", color=" + color + ", department=" + department + ", description="
                + description + ", onHand=" + onHand + ", owner=" + owner + ", sku=" + sku + ", store=" + store
                + ", storeId=" + storeId + ", style=" + style + ", upc=" + upc + "]";
    }

}
