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
    private ReceiptMessagesStrategy receiptMessages;

    public ReceiptMessagesStrategy getReceiptMessages() {
        return receiptMessages;
    }

    public void setReceiptMessages(ReceiptMessagesStrategy receiptMessages) {
        this.receiptMessages = receiptMessages;
    }

    public DataStorageStrategy getDatabase() {
        return db;
    }

    public void setDatabase(DataStorageStrategy database) {
        this.db = database;
    }

    public Receipt(Customer customer, DataStorageStrategy db, ReceiptMessagesStrategy msgs) {
        this.customer = customer;
        this.db = db;
        this.receiptMessages = msgs;
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
    

    
    public final void addLineItem(String prodId, int qty) {
        
        LineItem item = new LineItem(db.getProductInfo(prodId), qty);
        //added to test if this is being passed correctly to addToArray method
        //System.out.println(item.toString());
        
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
        
        for(int i=0;i<lineItems.length;i++){ 
                //return lineItems.toString();
            return lineItems[i].toString();
            
        }
            return "Thank you for shopping at Kohls!";
    }
    
}
