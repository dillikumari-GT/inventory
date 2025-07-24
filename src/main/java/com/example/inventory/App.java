package com.example.inventory;

import java.util.*;

public class App {
static HashMap<String, Integer> inventory = new HashMap<>();

public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);  
    while (true) {  
        System.out.println("\n1. Add item\n2. Remove item\n3. View inventory\n4. Exit");  
        int choice = scanner.nextInt();  
        scanner.nextLine(); // consume newline  

        switch (choice) {  
            case 1:  
                System.out.print("Item name: ");  
                String item = scanner.nextLine();  
                System.out.print("Quantity: ");  
                int qty = scanner.nextInt();  
                inventory.put(item, inventory.getOrDefault(item, 0) + qty);  
                break;  
            case 2:  
                System.out.print("Item to remove: ");  
                String removeItem = scanner.nextLine();  
                inventory.remove(removeItem);  
                break;  
            case 3:  
                System.out.println("Current Inventory:");  
                for (Map.Entry<String, Integer> entry : inventory.entrySet()) {  
                    System.out.println(entry.getKey() + ": " + entry.getValue());  
                }  
                break;  
            case 4:  
                System.out.println("Exiting...");  
                return;  
            default:  
                System.out.println("Invalid option");  
        }  
    }  
}

}
