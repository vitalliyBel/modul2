package com.rest.controller;

import com.rest.entity.Weather;
import com.rest.weatherPars.WeatherParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;


@RestController //Класс управляет рест запросами и ответами
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private WeatherParserService weatherParserService;

//    @GetMapping("/weather")
//    public Weather showCity() throws Exception {
//       Weather gorod = weatherParserService.getTemper();
//        return gorod;
//    }
    @GetMapping("/weather")
    public String showWeather() throws Exception {
       Weather pogoda = weatherParserService.getTemper();
        return pogoda.getTemp();
    }


}
