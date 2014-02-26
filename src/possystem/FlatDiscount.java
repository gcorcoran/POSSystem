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
public class FlatDiscount implements DiscountStrategy{
    
    private double itemCost;
    private double itemQuanity;
    private double dollarDiscount;

    public FlatDiscount(double itemCost, double itemQuanity, double dollarDiscount) {
        this.itemCost = itemCost;
        this.itemQuanity = itemQuanity;
        this.dollarDiscount = dollarDiscount;
    }

    @Override
    public double getDiscountAmount(){
        return dollarDiscount;
    }
    
    @Override
    public double getTotalCost(){
        return (itemCost * itemQuanity) -  dollarDiscount;
    }
    
    @Override
    public double getItemCost() {
        return itemCost;
    }

    @Override
    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public double getItemQuanity() {
        return itemQuanity;
    }

    @Override
    public void setItemQuanity(double itemQuanity) {
        this.itemQuanity = itemQuanity;
    }
    
}
