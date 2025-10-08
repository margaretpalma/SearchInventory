package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {

        //arraylist
        ArrayList<Product> inventory = getInventory();

        System.out.println("Items in Inventory: ");

        //todo: loops and display


        }



    }


    //products
    public static ArrayList<Product> getInventory(){
        ArrayList<Product> inventory = new ArrayList<Product>();
//match the workbook ",add"

        inventory.add(new Product(8500, "vinyl", 25.89f));
        inventory.add(new Product(8501, "controller", 75.99f));
        inventory.add(new Product(8502, "watch", 85.99f));
        inventory.add(new Product(8503, "keyboard", 99.99f));
        inventory.add(new Product(8504, "airpods", 105.99f));
//return
        return inventory;
    }


}