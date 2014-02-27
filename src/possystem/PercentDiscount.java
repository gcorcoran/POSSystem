

package possystem;

/**
 *
 * @author Greg
 */
public class PercentDiscount implements DiscountStrategy {
    
    private double percentDiscount=.1;

    public PercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }
    
    @Override
    public double getDiscountAmount(double itemCost, double itemQuantity){
        return itemCost * itemQuantity * percentDiscount;
    }
    
    @Override
    public double getTotalCost(double itemCost, double itemQuantity){
        return (itemCost * itemQuantity) - (itemCost * itemQuantity * percentDiscount);
    }
    
    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

   
    
}
