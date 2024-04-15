package org.app;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.*;

public class JSONParse {
    public static void getJSON(String jsonString){
        System.out.println("getJSON Running");

        Object jsonObject = JSONValue.parse(jsonString);
        JSONArray array = (JSONArray) jsonObject;

        // System.out.println("JSONObject = ", jsonObject);
        // System.out.println("Array", array);
    }
}
