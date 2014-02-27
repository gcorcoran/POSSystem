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
    private double itemQuantity=0;
    private final double discount = 0;

    public NoDiscount(double dollarDiscount) {
    }

    @Override
    public double getDiscountAmount(double itemQuantity, double itemCost){
        return 0;
    }
    
    @Override
    public double getTotalCost(double itemCost,double itemQuantity){
        return (itemCost * itemQuantity);
    }
    
}
