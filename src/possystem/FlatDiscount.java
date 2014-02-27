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

    private double dollarDiscount=2;

    public FlatDiscount(double dollarDiscount) {
        this.dollarDiscount = dollarDiscount;
    }

    @Override
    public double getDiscountAmount(){
        return dollarDiscount;
    }
    
    @Override
    public double getTotalCost(double itemCost, double itemQuanity){
        return (itemCost * itemQuanity) -  dollarDiscount;
    }

    
}
