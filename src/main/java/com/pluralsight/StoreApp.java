package com.pluralsight;
import java.util.ArrayList;

public class StoreApp {
    public static void main(String[] args) {

        //arraylist
        ArrayList<Product> inventory = getInventory();

        System.out.println("Items in Inventory: ");

        //todo: loops and display

        //%d decimal for price, %s string(getProductType) %.2f money (2 decimals),

        for(Product p : inventory){
            System.out.printf("id: %d %s - Price: $%.2f\n", p.getProductId(), p.getProductType(), p.getProductPrice());

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