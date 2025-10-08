package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        System.out.println("Items in Inventory: ");

        //todo: loops

    }

    public static ArrayList<Product> getInventory(){
        ArrayList<Product> inventory = new ArrayList<Product>();

        Product p1 = new Product(8500, "vinyl", 25.89f);
                inventory.add(p1);

        Product p2 = new Product(8501, "controller", 75.99);
                inventory.add(p2);

        Product p3 = new Product(8502,"watch", 85.99);
                inventory.add(p3);

        Product p4 = new Product(8503,"keyboard", 99.99);
    }




}