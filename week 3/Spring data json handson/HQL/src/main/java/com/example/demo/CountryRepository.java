package com.example.demo;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {

    @Query("SELECT c FROM Country c WHERE c.name = :name")
    List<Country> findByCountryNameHQL(@Param("name") String name);

    @Query(value = "SELECT * FROM country WHERE capital = :capital", nativeQuery = true)
    List<Country> findByCapitalNative(@Param("capital") String capital);
}
