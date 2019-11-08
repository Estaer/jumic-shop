package com.essa.jumic.models;

import java.util.Date;

public class Delivery {

    int deliveryId;
    String location;
    Date date;
    double price;
    Date preferredDay;

    public Delivery(int deliveryId, String location, Date date, double price, Date preferredDay) {
        this.deliveryId = deliveryId;
        this.location = location;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPreferredDay() {
        return preferredDay;
    }

    public void setPreferredDay(Date preferredDay) {
        this.preferredDay = preferredDay;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", preferredDay=" + preferredDay +
                '}';
    }
}
