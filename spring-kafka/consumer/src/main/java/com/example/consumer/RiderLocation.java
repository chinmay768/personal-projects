package com.example.consumer;

public class RiderLocation {
    private String riderId;
    private double latitude;
    private double longitude;

    public String getRiderId() {
        return riderId;
    }

    public RiderLocation() {
    }

    public RiderLocation(double latitude, double longitude, String riderId) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.riderId = riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
