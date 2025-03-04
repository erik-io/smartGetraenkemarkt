package org.salesAPI.repository;

import org.salesAPI.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherDataRepository extends JpaRepository<Weather, Long> {
}