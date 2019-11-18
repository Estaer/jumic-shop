package com.essa.jumic.generator;

import com.essa.jumic.models.Delivery;
import com.github.javafaker.Faker;

import java.lang.reflect.Array;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DeliveryGenerator {
    private static List<String> locations;
    static ChronoLocalDate deliveryDate;
    static ThreadLocalRandom RANDOM;
    static double deliveryPrice;
    static Faker faker;

    static {
        faker = new Faker();
        locations = new ArrayList<>();
        RANDOM = ThreadLocalRandom.current();
    }

    public static void main(String[] args) {
        System.out.println(getDeliveryDetails());
    }

   /* Location:
    If "preferred_day" is selected, adjust delivery date to next best day to deliver to customer.*/


   static Delivery getDeliveryDetails() {
       int deliveryId = faker.idNumber().hashCode();
       String location = getLocation();

       // Calculate delivery date and delivery price
       String preferredDay = selectPreferedDay();
       switch (OrderItemGenerator.fetchOrderItem().catalogType){
           case JUMIC_FIRST:
               if(preferredDay != null){
                   deliveryDate = (LocalDate.now().plusDays(2)).with(TemporalAdjusters.nextOrSame(DayOfWeek.valueOf(preferredDay)));
               }
               else{
                   deliveryDate = LocalDate.now().plusDays(2);
               }
               deliveryPrice = Math.abs(10 + Integer.parseInt(getLocation()));
               break;

           case JUMIC_GLOBAL:
               if(preferredDay!= null){
                   deliveryDate = (LocalDate.now().plusDays(RANDOM.nextInt(10, 12))).with(TemporalAdjusters.nextOrSame(DayOfWeek.valueOf(preferredDay)));
               }
               else {
                   deliveryDate = LocalDate.now().plusDays(RANDOM.nextInt(10, 12));
               }
               deliveryPrice = Math.abs(5 + 0.5 * Integer.parseInt(getLocation()));
               break;

           case JUMIC_NORMAL:
               if(preferredDay!= null){
                   deliveryDate = (LocalDate.now().plusDays(RANDOM.nextInt(4, 7))).with(TemporalAdjusters.nextOrSame(DayOfWeek.valueOf(preferredDay)));

               }
               else {
                   deliveryDate = LocalDate.now().plusDays(RANDOM.nextInt(4, 7));
               }
               deliveryPrice = Math.abs(5+ 0.2*(Integer.parseInt(getLocation())));

               break;

           default:
               System.out.print("Order cannot be processed");

       }
           return new Delivery(deliveryId, location, deliveryDate, deliveryPrice, preferredDay);
   }

    private static String getLocation() {

        for(int i=0; i<=30; i++){

            int distance = RANDOM.nextInt(1,10);
            String location  = "Area"+ distance;
            locations.add(location.substring(4));

        }

        return locations.get((RANDOM.nextInt(1, 30)));
    }

    private static String selectPreferedDay() {

       List<String> daysOfWeek = new ArrayList<>();

        DateFormatSymbols days = new DateFormatSymbols();
        String[] weekdays = days.getWeekdays();

        for (int i = 1; i < 8; i++){
            String day = (String) Array.get(weekdays, i);
            daysOfWeek.add(day.toUpperCase());
        }

        return daysOfWeek.get(RANDOM.nextInt(0,8));
    }




}
