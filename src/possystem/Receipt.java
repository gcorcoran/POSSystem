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
    private LineItem lineItems[];

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
    
    public void scanItem(String upc, double quantity) {
        LineItem temp[]= new LineItem[lineItems.length+1];
        for (LineItem lineItem : lineItems) {
            
        }
        
    }
    
    
    
}
