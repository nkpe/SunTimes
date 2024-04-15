/*
 * This source file was generated by the Gradle 'init' task
 */
package org.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;

public class App {
    public static void main(String[] args) {
        info();
        Location userLocation = UserInput.userInput();
        URL apiURL = parseURl(userLocation);

        if (apiURL == null){
            return;
        }

        apiRequest(apiURL);

        // 51.515972, -0.174943 
    }

    private static void info() {
        System.out.println("Provide longitude and latitude for location of Sunset");
    }

    private static URL parseURl(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        String queryData = new String("lat=" + String.valueOf(latitude) + "&lng=" + String.valueOf(longitude));
        URL urlAPI = null;

        try {
            urlAPI = new URI("https://api.sunrisesunset.io/json?" + queryData).toURL();
        } catch (URISyntaxException e) {
            System.out.println("URI Syntax Exception");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Error occurred parsing URI");
        }

        return urlAPI;
        
    }

    private static void apiRequest(URL apiUrl){
        try {
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");
            int status = connection.getResponseCode();
            Reader streamReader = null;

            if (status > 299) {
                streamReader = new InputStreamReader(connection.getErrorStream());
            } else {
                streamReader = new InputStreamReader(connection.getInputStream());
            }

            BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );

            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null){
                content.append(inputLine);
                JSONParse.getJSON(inputLine);
                System.out.println("Input Line " + inputLine);
            }
            
            in.close();
            FullResponseBuilder.getFullResponse(connection);
        } catch (Exception e) {
            System.out.println("An error occurred");
            System.out.println(e);
        }
    }

    // public ArrayList<String> getValueForKey(String jsonArrayStr, String key) {
    //     JsonReader = Json
    // }
}
