package org.app;

import org.json.simple.parser.ContainerFactory;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


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
            Map<String, Object> map = (Map <String, Object>) parser.parse(jsonString, containerFactory);
            map.forEach((k,v)->System.out.println("Key: " + k + "Value: + " + v));
        } catch (ParseException pe) {
            System.out.println(pe);
        } catch (Exception e){
            System.out.println(e);
        }

        // System.out.println("JSONObject = ", jsonObject);
        // System.out.println("Array", array);
    }
}
