package org.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;

public class Request {
    public static URL parseURl(Location location) {
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

    public static String apiRequest(URL apiUrl){
        String outputLine = "";

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

            StringBuffer content = new StringBuffer();
            String inputLine = null;

            while ((inputLine = in.readLine()) != null){
                content.append(inputLine);
            }

            outputLine = content.toString();
            
            in.close();
            FullResponseBuilder.getFullResponse(connection);
        } catch (Exception e) {
            System.out.println("An error occurred");
            System.out.println(e);
        }

        return outputLine;
    }
}
