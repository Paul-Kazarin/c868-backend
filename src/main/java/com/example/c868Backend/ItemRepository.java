package com.example.c868Backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ItemRepository extends CrudRepository<Item, Long>, JpaRepository<Item, Long> {

    @Query(nativeQuery = true, value = "SELECT  "
           + " * "
           + "FROM  "
           + "item "
           + "WHERE  "
           + "date_created >= :createdStartDate "
           + "AND  "
           + "date_created <= :createdEndDate "
    )
    Iterable<Item> findItemsInDateCreatedRange(@Param(value = "createdStartDate") String createdStartDate, @Param(value = "createdEndDate") String createdEndDate);

    @Query(nativeQuery = true, value = "SELECT  "
                                           + " * "
                                           + "FROM  "
                                           + "item "
                                           + "WHERE  "
                                           + "date_updated >= :updatedStartDate "
                                           + "AND  "
                                           + "date_updated <= :updatedEndDate "
    )
    Iterable<Item> findItemsInDateUpdatedRange(@Param(value = "updatedStartDate") String updatedStartDate, @Param(value = "updatedEndDate") String updatedEndDate);
    @Query(nativeQuery = true, value = "SELECT  "
                                           + " * "
                                           + "FROM  "
                                           + "item "
                                           + "WHERE  "
                                           + "date_updated >= :updatedStartDate "
                                           + "AND  "
                                           + "date_updated <= :updatedEndDate "
                                           + "AND  "
                                           + "date_created >= :createdStartDate "
                                           + "AND  "
                                           + "date_created <= :createdEndDate "
    )
    Iterable<Item> findItemsInBothRanges(@Param(value = "updatedStartDate") String updatedStartDate, @Param(value = "updatedEndDate") String updatedEndDate, @Param(value = "createdStartDate") String createdStartDate, @Param(value = "createdEndDate") String createdEndDate);
}
