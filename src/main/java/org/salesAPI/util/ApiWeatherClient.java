package org.salesAPI.util;

import org.springframework.web.client.RestTemplate;
import org.salesAPI.model.Weather;

public class ApiWeatherClient {

    private static final String API_URL = "https://api.weather.com/v3/wx/conditions/current";

    public static Weather fetchWeatherData() {
        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(API_URL, Weather.class);
        return weather;
    }
}
