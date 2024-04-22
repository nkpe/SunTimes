package org.app;

import org.json.simple.parser.ContainerFactory;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.lang.reflect.*;

import javax.swing.plaf.synth.SynthTextAreaUI;


public class JSONParse {
    public static void getJSON(String jsonString){
        System.out.println("getJSON Running");
        JSONParser parser = new JSONParser();
        ContainerFactory containerFactory = new ContainerFactory() {
            @Override
            public Map createObjectContainer() {
                return new LinkedHashMap<>();
            }
            @Override
            public List creatArrayContainer() {
                return new LinkedList<>();
            }
        };

        try {
            Object returned = parser.parse(jsonString, containerFactory); 
            Map<String, Object> mapReturned = mapReturned.getClass()
            System.out.println("Map returned in OG state: " + mapReturned);

            // String results = mapReturned.get("results").toString();
            // System.out.println("RESULTS= " + results);

            // Map<String, Object> resultsMap = (Map<String, Object>) parser.parse(results, containerFactory);

            // System.out.println("RESULTSMAP= " + resultsMap);

            // Object date = resultsMap.get("date");
            // Object sunrise = resultsMap.get("sunrise");
            // Object sunset = resultsMap.get("sunset");
            
            // System.out.println("");
            // System.out.println("Here are the sunrise and sunset times for " + date + ".");
            // System.out.println("Sunrise in your location is at: " + sunrise);
            // System.out.println("Sunset in your location is at: " + sunset);
        } catch (ParseException pe) {
            System.out.println(pe);
        } catch (Exception e){
            System.out.println(e);
        }

        // System.out.println("JSONObject = ", jsonObject);
        // System.out.println("Array", array);
    }
}
