package org.app;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.lang.reflect.*;

import javax.swing.plaf.synth.SynthTextAreaUI;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONParse {
    public static void getJSON(String jsonString){
        System.out.println("getJSON Running");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);
            // Map<String, Object> map = objectMapper.readValue(jsonString, new TypeReference<Map<String, Object>>() {});
            Object sunrise = jsonNode.get("results").get("sunrise").textValue();
            System.out.println("SUNRISE:  " + sunrise);
        } catch(Exception e){
            System.out.println(e);
        }
            
    }       
}
