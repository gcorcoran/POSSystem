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
    private DataStorageStrategy db;
    private LineItem[] lineItems;

    public DataStorageStrategy getDatabase() {
        return db;
    }

    public void setDatabase(DataStorageStrategy database) {
        this.db = database;
    }

    public Receipt(Customer customer, DataStorageStrategy db) {
        this.customer = customer;
        this.db = db;
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
    
    public final void addLineItem(String prodId, int qty) {
        // needs validation
        
        LineItem item = new LineItem(db.getProductInfo(prodId), qty);
        //added to test if this is being passed correctly to addToArray method
        System.out.println(item.toString());
        
        addToArray(item);
    }
    
    //private void addToArray(final LineItem item) {
        private void addToArray(LineItem item) {
        // needs validation
            if(lineItems==null){
                lineItems=new LineItem[0];
            }
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
