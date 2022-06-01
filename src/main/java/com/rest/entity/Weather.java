package com.rest.entity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;

@Component
public class Weather {

    private String city;

    private static Document getPage1() throws IOException {

        String url="http://localhost:8080/modul1/api/city";

        Document page1 = Jsoup.parse(new URL(url), 3000 );
        return page1;
    }

    public String getGorod() throws Exception {

        Document page = getPage1();
        Element tableTemp = page.select("body").first();
        city = tableTemp.text();
        return city;
    }

    private String temp;

    public Weather(String city, String temp) {
        this.city = city;
        this.temp = temp;
    }

    public Weather() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}