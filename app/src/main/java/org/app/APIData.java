package org.app;

import com.fasterxml.jackson.databind.JsonNode;

public class APIData {
    private String date;
    private String sunrise;
    private String sunset;
    private String first_light;
    private String last_light;

    public APIData (JsonNode jsonNode){
            Object dateValue = jsonNode.get("results").get("date").textValue();
            date = dateValue.toString();

            Object sunriseValue = jsonNode.get("results").get("sunrise").textValue();
            sunrise = sunriseValue.toString();

            Object sunsetValue = jsonNode.get("results").get("sunset").textValue();
            sunset = sunsetValue.toString();
    }

    public String getDate(){
        return this.date;
    }

    public String getSunrise(){
        return this.sunrise;
    }

    public String getSunset(){
        return this.sunset;
    }


}