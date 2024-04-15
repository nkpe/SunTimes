package org.app;

import java.util.Scanner;

public class UserInput {

    public static double userLatitudeInput(Scanner scanner){
        System.out.println("Input location latitude: ");
        double latitude = Double.parseDouble(scanner.nextLine());
        
        return latitude;
    }

    public static double userLongitudeInput(Scanner scanner){
        System.out.println("Input location longitude: ");
        double longitude = Double.parseDouble(scanner.nextLine());

        return longitude;
    }

    public static Location userInput(){
        Scanner scanner = new Scanner(System.in);
        double latitude = userLatitudeInput(scanner);
        double longitude = userLongitudeInput(scanner);

        Location userLocation = new Location(latitude, longitude);
        scanner.close();
        
        return userLocation;
    }

}
