package com.unicomer.productstore.rest.model;

public class ItemsModel {
    private Long storeId;
    private String store;
    private Integer sku;
    private String owner;
    private String department;
    private String upc;
    private String description;
    private String brand;
    private String style;
    private String color;
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
