package com.rest.weatherPars;

import com.rest.entity.Weather;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.net.URL;

@Component
public class WeatherParser implements WeatherParserService {
    @Autowired
    private Weather weather;

    public Document getPage() throws Exception {

        String url = "https://api.openweathermap.org/data/2.5/weather?q="+weather.getGorod()+"&appid=b9f50299bf00aed5dfd712d0d11aa976&mode=html";
        Document page = Jsoup.parse(new URL(url), 3000);

        return page;
    }


    public Weather getTemper() throws Exception {
        Document page = getPage();
        Element tableTemp = page.select("div[title=Current Temperature]").first();
        weather.setTemp(tableTemp.text());

        return weather;

    }
}



