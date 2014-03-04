/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem;

/**
 *
 * @author Pip
 */
public class Receipt {
    
    Customer customer;
    LineItem lineitems[];

    public Receipt(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineitems() {
        return lineitems;
    }

    public void setLineitems(LineItem[] lineitems) {
        this.lineitems = lineitems;
    }
    
    public void scanItem(String upc, double quantity) {
        Product product = null;
        product = this.getProductInfo(upc);
    }
    
    
    
}
