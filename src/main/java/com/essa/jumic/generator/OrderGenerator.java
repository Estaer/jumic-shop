package com.essa.jumic.generator;

import com.essa.jumic.models.Customer;
import com.essa.jumic.models.Delivery;
import com.essa.jumic.models.Order;
import com.essa.jumic.models.OrderItem;
import com.github.javafaker.Faker;


import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.essa.jumic.generator.CustomerGenerator.customers;
import static com.essa.jumic.generator.DeliveryGenerator.getDeliveryDetails;

public class OrderGenerator {

    static ThreadLocalRandom RANDOM;
    private static Faker faker;

    static {
        faker = new Faker();
        RANDOM = ThreadLocalRandom.current();
        calculateTotalItemPrice();

    }

    public static void main(String[] args) {

    }

    private static Order generateOrderDetails() {

        int orderId = faker.idNumber().hashCode();
        List items = getRandomOrderItems();
        double totalPrice = calculateTotalItemPrice();
        Delivery delivery = getDeliveryDetails();
        Customer customer = customers.get(RANDOM.nextInt(0,20)) ;

        return new Order(orderId, items, totalPrice, delivery, customer);
    }


    private static double calculateTotalItemPrice() {
        List<OrderItem> items = getRandomOrderItems();

        double sum = 0;

        for(OrderItem item: items) {
            double price = item.getPrice();
            sum = sum + price;
        }
        return  sum;

    }

    private static List<OrderItem> getRandomOrderItems() {
        List<OrderItem> givenList = OrderItemGenerator.items;
        Collections.shuffle(givenList);
        Collections.shuffle(givenList);
        int randomSeriesLength =  RANDOM.nextInt(1,5);

        List<OrderItem> randomSeries = givenList.subList(0, randomSeriesLength);
        return randomSeries;
    }
}
