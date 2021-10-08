package com.unicomer.productstore.jpa.repository;

import java.util.Optional;

import com.unicomer.productstore.jpa.entity.ItemsAvailabilityEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsAvailabilityRepository extends JpaRepository<ItemsAvailabilityEntity, Long> {

        Optional<ItemsAvailabilityEntity> findItemsAvailabilityEntityByCountryISOCode(String countryISOCode);
}
