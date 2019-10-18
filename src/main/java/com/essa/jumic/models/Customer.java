package com.essa.jumic.models;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    public static void main(String[] args) {
        generateCustomerDetails();
    }


    private static void generateCustomerDetails(){
        Map<String, Map<String, String>> customers = new HashMap<>();

        int i = 20;
        while (i > 0) {
            Faker faker = new Faker();
            int customerId = faker.idNumber().hashCode();
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            String name = (firstName +" "+ lastName);
            String email = (firstName.toLowerCase() + lastName.toLowerCase()+ "@gmail.com");
            int phoneNumber = faker.phoneNumber().hashCode();

            Map<String, String> customer = new HashMap<>();
            customer.put("id", String.valueOf(customerId));
            customer.put("name",name);
            customer.put("email",email);
            customer.put("phonenumber", String.valueOf(phoneNumber));

            customers.put(customer.get("id"), customer);
//            System.out.println(customer);
            i--;
        }
    }
}
