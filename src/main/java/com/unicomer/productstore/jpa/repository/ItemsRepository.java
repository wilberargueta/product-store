package com.unicomer.productstore.jpa.repository;

import java.util.List;

import com.unicomer.productstore.jpa.entity.ItemsAvailabilityEntity;
import com.unicomer.productstore.jpa.entity.ItemsEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsEntity, Long> {
    @Query("SELECT i FROM ItemsEntity i" + " WHERE i.itemsAvailability=:itemsAvailability "
            + "AND (i.brand=:brand OR i.upc=:upc OR i.department=:department OR i.style=:style OR i.store=:store) "
            + "ORDER BY i.createAt ASC")
    List<ItemsEntity> findItemsEntityQuery(
            @Param("itemsAvailability") ItemsAvailabilityEntity itemsAvailability, @Param("brand") String brand,
            @Param("department") String department, @Param("store") String store, @Param("style") String style,
            @Param("upc") String upc);

}
