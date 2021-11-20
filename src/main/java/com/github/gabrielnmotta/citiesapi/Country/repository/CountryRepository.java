package com.github.gabrielnmotta.citiesapi.Country.repository;

import com.github.gabrielnmotta.citiesapi.Country.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
