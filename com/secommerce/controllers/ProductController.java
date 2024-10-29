package controllers;
import models.Products;
import utils.ItemAbstract;

public class ProductController extends ItemAbstract {
    // Create product
    public void createProduct ( String itemID, String itemName, String itemDescription, byte rate, int price) {
        var newProduct = new Products(itemID, itemName, itemDescription, price, rate);
        System.out.println("Product Created Successfully!");
    }

    // Implementing Getting all products
    @Override
    public void getItems() {
        for ( Products product : Products.products) {
            System.out.println("Product ID: " + product.itemID + "\nProduct Name: " + product.itemName + "\nProduct Description: " + product.itemDescription + "\nProduct rate: " + product.rate + "\nProduct price: " + product.price);
        }
    }

    // Implementing Getting a single product
    @Override
    public void getItem (String itemID) {
        for ( Products product: Products.products ) {
                if (product.itemID.equals(itemID)) {
                    System.out.println("Product ID: " + product.itemID + "\nProduct Name: " + product.itemName + "\nProduct Description: " + product.itemDescription + "\nProduct rate: " + product.rate + "\nProduct price: " + product.price);
                }
        }
        System.out.println("Product Not Found!");
    }

    // Implementing Updating the product
    @Override
    public void updateItem ( String itemID ) {

    }

    // Implementing Deleting the product
    @Override
    public void deleteItem ( String itemID ) {

    }
}