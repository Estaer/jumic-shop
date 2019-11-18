package com.essa.jumic.models;

import java.util.List;

public class Order {

    int orderId;
    List orderItems;
    double totalPrice;
    Delivery delivery;
    Customer customer;
    CatalogEnum catalogType;

    public Order(int orderId, List orderItems, double totalPrice, Delivery delivery, Customer customer) {
        this.orderId = orderId;
        this.orderItems = orderItems;
        this.totalPrice = totalPrice;
        this.delivery = delivery;
        this.customer = customer;
    }

    public CatalogEnum getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogEnum catalogType) {
        this.catalogType = catalogType;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }



    public List getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderItems=" + orderItems +
                ", orderTotal=" + totalPrice +
                ", delivery=" + delivery +
                ", customer=" + customer +
                ", catalogType=" + catalogType +
                '}';
    }
}
