package com.essa.jumic.generator;

import com.essa.jumic.models.CatalogEnum;
import com.essa.jumic.models.OrderItem;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class OrderItemGenerator {

     static List<OrderItem> items ;
     final static ThreadLocalRandom RANDOM;

    static {
        items = new ArrayList<>();
        RANDOM = ThreadLocalRandom.current();
        generateItems();
    }

    public static void main(String[] args) {
    }

    private static OrderItem createItemDetails(){
        Faker faker = new Faker();
        int itemId = faker.idNumber().hashCode();
        String itemName = faker.beer().name();
        double price = faker.number().randomDouble(2, 1, 10);
        return new OrderItem(itemId,itemName,price,itemName + "_desc", getRandomCatalog());
    }

    private static void generateItems(){
        for(int i=0; i<200; i++){
            items.add(createItemDetails());
        }
    }

    static OrderItem fetchOrderItem(){
        return items.get(RANDOM.nextInt(0, 200));
    }

    private static CatalogEnum getRandomCatalog() {
        CatalogEnum[] catalogs = CatalogEnum.values();
        return catalogs[RANDOM.nextInt(catalogs.length)];
    }

}
