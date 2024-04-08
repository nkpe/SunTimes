import java.net.*;

public class Main {
    public static void main(String[] args) {
        init();
        Location currentLocation = new Location(-0.174943, 51.515972);
        String apiRequestTest = apiRequest(currentLocation.getLatitude(), currentLocation.getLongitude());
        System.out.println(apiRequestTest);
        isTrue(2);
    }

    private static void init() {
        System.out.println("Provide longitude and latitude for location of Sunset");
    }

    private static void isTrue(int x) {
        if (x == 2) {
            System.out.println("Test 1. x is " + x);
        }
        ;
    }

    private static String apiRequest(double latitude, double longitude) {
        String queryData = new String("lat=" + String.valueOf(latitude) + "&lng=" + String.valueOf(longitude));
        System.out.println("QueryData= " + queryData);
        String result = "";
        try {
            URL urlAPI = new URI("https://api.sunrisesunset.io/json?" + queryData).toURL();
            result = urlAPI.toString();
        } catch (URISyntaxException e) {
            System.out.println("URI Syntax Exception");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Error occurred parsing URI");
        }
        return result;
    }

}
