package org.app;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONParse {
    public static JsonNode getJSON(String jsonString) {
        // System.out.println("getJSON Running");
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = null;

        try {
            jsonNode = objectMapper.readTree(jsonString);
        } catch (Exception e) {
            System.out.println(e);
        }

        return jsonNode;
    }

}