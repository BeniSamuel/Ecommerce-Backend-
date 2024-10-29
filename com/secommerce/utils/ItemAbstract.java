package utils;

public abstract class ItemAbstract {
    
    // Abstract method for getting many items
    public abstract void getItems();

    // Abstract method for getting a single item
    public abstract void getItem( String itemID );

    // Abstract method for updating an item
    public abstract void updateItem( String itemID );

    // Abstract method for deleting an item
    public abstract void deleteItem ( String itemID );
}
