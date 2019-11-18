package com.essa.jumic.generator;

import com.essa.jumic.models.Customer;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class CustomerGenerator {
    static List<Customer> customers ;
    static {
        customers = new ArrayList<>();
        generateCustomerDetails();
    }

    public static void main(String[] args) {

    }


    private static void generateCustomerDetails(){

        int i = 20;
        while (i > 0) {
            Faker faker = new Faker();
            int customerId = faker.idNumber().hashCode();
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            String name = (firstName +" "+ lastName);
            String email = (firstName.toLowerCase() + lastName.toLowerCase()+ "@gmail.com");
            int phoneNumber = faker.phoneNumber().hashCode();

            customers.add(new Customer(customerId, name, email, phoneNumber));
            i--;

        }
        System.out.println(customers);
    }
}
