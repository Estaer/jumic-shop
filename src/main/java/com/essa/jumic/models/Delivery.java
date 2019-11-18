package com.essa.jumic.models;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Delivery {

    int deliveryId;
    String location;
    ChronoLocalDate deliveryDate;
    double price;
    String preferredDay;

    public Delivery(int deliveryId, String location, ChronoLocalDate deliveryDate, double price, String preferredDay) {
        this.deliveryId = deliveryId;
        this.location = location;
        this.deliveryDate = deliveryDate;
        this.price = price;
        this.preferredDay = preferredDay;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ChronoLocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(ChronoLocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPreferredDay() {
        return preferredDay;
    }

    public void setPreferredDay(String preferredDay) {
        this.preferredDay = preferredDay;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", location='" + location + '\'' +
                ", date=" + deliveryDate +
                ", price=" + price +
                ", preferredDay=" + preferredDay +
                '}';
    }
}
