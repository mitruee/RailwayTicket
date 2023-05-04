package com.example.railwayticket;

import java.io.Serializable;

public class Ticket implements Serializable {

    private String name;
    private String placeFrom;
    private String placeTo;
    private String timeFrom;
    private String timeTo;
    private String price;

    public Ticket(String name, String placeFrom, String placeTo, String timeFrom, String timeTo, String price) {
        this.name = name;
        this.placeFrom = placeFrom;
        this.placeTo = placeTo;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceFrom() {
        return placeFrom;
    }
    public void setPlaceFrom(String placeFrom) {
        this.placeFrom = placeFrom;
    }

    public String getPlaceTo() {
        return placeTo;
    }
    public void setPlaceTo(String placeTo) {
        this.placeTo = placeTo;
    }

    public String getTimeFrom() {
        return timeFrom;
    }
    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }
    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
