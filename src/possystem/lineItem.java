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
public class lineItem {
    
    private double quanity;
    private String UPC;
    private double itemPrice;
    private String itemDiscription;
    private DiscountStrategy discount;

    public lineItem(double quanity,Product product, DiscountStrategy discount) {
        this.quanity = quanity;
        this.UPC = product.getUPC();
        this.itemPrice = product.getItemPrice();
        this.itemDiscription = product.getItemDiscription();
        this.discount = discount;
        discount.setItemQuanity(quanity);
    }
    
    
}
