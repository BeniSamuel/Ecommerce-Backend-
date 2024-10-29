package models;
import java.util.ArrayList;

public class Products {
    public String itemID;
    public String itemName;
    public String itemDescription;
    public byte rate;
    public int price;
    public static ArrayList<Products> products = new ArrayList<Products>();

    public Products ( String itemID, String itemName, String itemDescription, int price, byte rate) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
        this.rate = rate;
        products.add(this);
    }


}
