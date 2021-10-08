package com.unicomer.productstore.jpa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_AVAILABILITY")
public class ItemsAvailabilityEntity extends AbstractAuditEntity implements Serializable, EntityInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "COUNTRY_ISO_CODE", unique = true)
    private String countryISOCode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "itemsAvailability", cascade = CascadeType.ALL)
    private List<ItemsEntity> items;

    public ItemsAvailabilityEntity() {
    }

    public ItemsAvailabilityEntity(Long id, String countryISOCode, List<ItemsEntity> items) {
        this.id = id;
        this.countryISOCode = countryISOCode;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ItemsAvailabilityEntity [countryISOCode=" + countryISOCode + ", id=" + id + ", items=" + items + "]";
    }

}
