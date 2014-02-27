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
public class NoDiscount implements DiscountStrategy{
    
    private double itemCost;
    private double itemQuanity=0;
    private final double discount = 0;

    public NoDiscount(double itemCost, double dollarDiscount) {
        this.itemCost = itemCost;
    }

    @Override
    public double getDiscountAmount(){
        return 0;
    }
    
    @Override
    public double getTotalCost(){
        return (itemCost * itemQuanity);
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
