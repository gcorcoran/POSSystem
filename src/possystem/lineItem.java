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
    
    private Product product;
    private DiscountStrategy discount;
    private double quanity;

    public lineItem(double quanity,Product product, DiscountStrategy discount) {
        this.quanity = quanity;
        this.product = product;
        this.discount = discount;
        discount.setItemQuanity(quanity);
    }
    
    
}
