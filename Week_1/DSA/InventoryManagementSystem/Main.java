package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println("Inventory after adding products:");
        System.out.println(inventory);

        Product updatedProduct = new Product("P001", "Laptop", 15, 949.99);
        inventory.updateProduct(updatedProduct);

        System.out.println("Inventory after updating a product:");
        System.out.println(inventory);

        inventory.deleteProduct("P002");

        System.out.println("Inventory after deleting a product:");
        System.out.println(inventory);

        Product product = inventory.getProduct("P001");
        System.out.println("Retrieved Product:");
        System.out.println(product);
    }
}
