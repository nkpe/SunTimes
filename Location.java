public class Location {
    private double longitude;
    private double latitude;

    public Location(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    };

    public String toString( ){
        return "Location: " + latitude + " " + longitude;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public double getLatitude(){
        return this.latitude;
    }
}
