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
public class Item {
    
    private String UPC;
    private double itemPrice;
    private String itemDiscription;
    private DiscountStrategy discount;

    public Item(String UPC, double itemPrice, String itemDiscription, DiscountStrategy discount) {
        this.UPC = UPC;
        this.itemPrice = itemPrice;
        this.itemDiscription = itemDiscription;
        this.discount = discount;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDiscription() {
        return itemDiscription;
    }

    public void setItemDiscription(String itemDiscription) {
        this.itemDiscription = itemDiscription;
    }
    
    
    
}
