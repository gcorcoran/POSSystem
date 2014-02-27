

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
    public double getDiscountAmount(double itemCost, double itemQuanity){
        return itemCost * itemQuanity * percentDiscount;
    }
    
    @Override
    public double getTotalCost(double itemCost, double itemQuanity){
        return (itemCost * itemQuanity) - (itemCost * itemQuanity * percentDiscount);
    }
    
    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

   
    
}
