package com.fatdem.weather.repository;

import com.fatdem.weather.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<WeatherEntity,String> {

}
