package model;

public class Location {
    double latitude;
    double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Method to calculate the distance to another location using the Haversine formula
    static double distance(Location loc1, Location loc2) {
        final double R = 6371; // Earth radius in km
        double lat1 = Math.toRadians(loc1.latitude);
        double lat2 = Math.toRadians(loc2.latitude);
        double dLat = Math.toRadians(loc2.latitude - loc1.latitude);
        double dLon = Math.toRadians(loc2.longitude - loc1.longitude);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1) * Math.cos(lat2) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }


}
