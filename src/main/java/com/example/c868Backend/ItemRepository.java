package com.example.c868Backend;

import java.sql.Timestamp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ItemRepository extends CrudRepository<Item, Long> {

    @Query(nativeQuery = true, value = "SELECT  "
           + " * "
           + "FROM  "
           + "item"
           + "WHERE  "
           + "date_created >= :createdStartDate"
           + "AND  "
           + "date_created <= :createdEndDate"
    )
    Iterable<Item> findItemsInDateCreatedRange(@Param(value = "createdStartDate") Timestamp createdStartDate, @Param(value = "createdEndDate") Timestamp createdEndDate);

//    Iterable<Item> findItemsInDateCreatedRangePayload(Item range);
}
