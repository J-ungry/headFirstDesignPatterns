package com.example.weatherstation;

import com.example.weatherstation.display.CurrentConditionDisplay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherStationApplication {

    public static void main(String[] args) {

//        SpringApplication.run(WeatherStationApplication.class, args);
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurement(80,65,30.4f);
        weatherData.setMeasurement(70,48,41.8f);

    }

}
