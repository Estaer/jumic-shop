package com.essa.jumic.generator;

import com.essa.jumic.models.CatalogEnum;
import com.github.javafaker.Faker;


import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;
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
//        generateDeliveryDetails();
    }

    public static void main(String[] args) {
        generateDeliveryDetails();
    }
   /* Location:
    If "preferred_day" is selected, adjust delivery date to next best day to deliver to customer.*/


   private static void generateDeliveryDetails(){
       int i;
       for(i=0; i<=30; i++){

           int distance = RANDOM.nextInt(1,10);
           String location  = "Area"+ distance;
           locations.add(location.substring(4));

       }

       //use switch instead of if --->
       switch (OrderItemGenerator.fetchOrderItem().catalogType){
           case JUMIC_FIRST:
               deliveryDate = LocalDate.now().plusDays(2);
               deliveryPrice = Math.abs(10 + Integer.parseInt(locations.get((RANDOM.nextInt(1, 30)))));
               System.out.println(deliveryDate);
               System.out.println(deliveryPrice);
               break;

           case JUMIC_GLOBAL:
               deliveryDate = LocalDate.now().plusDays(RANDOM.nextInt(10,12));
               deliveryPrice = Math.abs(5 + 0.5 * Integer.parseInt(locations.get((RANDOM.nextInt(1, 30)))));
               System.out.println(deliveryDate);
               System.out.println(deliveryPrice);
               break;

           case JUMIC_NORMAL:
               deliveryDate = LocalDate.now().plusDays(RANDOM.nextInt(4,7));
               deliveryPrice = Math.abs(5+ 0.2*(Integer.parseInt(locations.get((RANDOM.nextInt(1, 30))))));
               System.out.println(deliveryDate);
               System.out.println(deliveryPrice);
               break;

           default:
               System.out.print("Order cannot be processed");

       }
   }
}
