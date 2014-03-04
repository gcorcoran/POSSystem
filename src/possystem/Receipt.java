/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem;

/**
 *
 * @author Greg
 */
public class Receipt {
    
    private Customer customer;
    private DataStorageStrategy database;
    private LineItem[] lineItems;

    public DataStorageStrategy getDatabase() {
        return database;
    }

    public void setDatabase(DataStorageStrategy database) {
        this.database = database;
    }

    public Receipt(Customer customer, DataStorageStrategy db) {
        this.customer = customer;
        this.database = db;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineitems() {
        return lineItems;
    }

    public void setLineitems(LineItem[] lineitems) {
        this.lineItems = lineitems;
    }
    
//    public void addItem(String upc, double quantity) {
//        LineItem newestLineItem = new LineItem(this.database.getProductInfo(upc),quantity);
//        this.addToArray(newestLineItem);
//        
//    }
//    
//    private void addToArray(LineItem newestLineItem) {
//        // needs validation
//        LineItem[] tempItems = new LineItem[lineItems.length + 1];
//        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
//        tempItems[lineItems.length] = newestLineItem;
//        lineItems = tempItems;
//    }
    
    public final void addLineItem(final String prodId, final int qty) {
        // needs validation
        LineItem item = new LineItem(this.database.getProductInfo(prodId), qty);
        addToArray(item);
    }
    
    private void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    
    
    
    public String printreceipt(){
        
        for (LineItem lineItem : lineItems) {
            return lineItem.toString();
        }
            return "Thank you for shopping at Kohls!";
    }
    
}
