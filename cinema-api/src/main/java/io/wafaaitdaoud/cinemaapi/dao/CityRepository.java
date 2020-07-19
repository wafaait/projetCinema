package io.wafaaitdaoud.cinemaapi.dao;

import io.wafaaitdaoud.cinemaapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface CityRepository extends JpaRepository<City, Long> {
}
