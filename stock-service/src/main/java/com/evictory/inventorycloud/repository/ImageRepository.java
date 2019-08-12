package com.evictory.inventorycloud.repository;

import com.evictory.inventorycloud.modal.DocumentTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Blob;

public interface ImageRepository extends JpaRepository<DocumentTable, Integer> {

//    @Query("insert into DocumentTable (content, filename) values(:name, :blob)")
//    DocumentTable add(@Param("Name") String name, @Param("blob") Blob blob);
}
