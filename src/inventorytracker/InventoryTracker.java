/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventorytracker;

/**
 *
 * @author dhruv
 */
public class InventoryTracker {

    /**
     * This is an initial version of InventoryTracker.java
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //added new method
    public void checkStockLevel(int stockQuantity) {
    if (stockQuantity <= 0) {
        System.out.println("Out of Stock");
    } else if (stockQuantity < 10) {
        System.out.println("Low Stock");
    } else {
        System.out.println("In Stock");
    }
}
    
}
