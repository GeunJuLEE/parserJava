package com.company;

public class MobilityData {
    private String user;
    private String dateTime;
    private String altitude;
    private String latitude;
    private String longitude;

    public MobilityData(String longData) {
        String str[] =  longData.split("\t");
        dateTime = str[0] + str[1];
        altitude = str[2];
        latitude = str[3];
        longitude = str[4];
    }

    public MobilityData(String user, String longData) {
        this.user = user;
        String str[] =  longData.split("\t");
        dateTime = str[0] + str[1];
        altitude = str[2];
        latitude = str[3];
        longitude = str[4];
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "MobilityData{" +
                "user='" + user + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", altitude='" + altitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
