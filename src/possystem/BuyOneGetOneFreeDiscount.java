

package possystem;

/**
 *
 * @author Greg
 */
public class BuyOneGetOneFreeDiscount implements DiscountStrategy  {

    
    private double totalDiscount;

    public BuyOneGetOneFreeDiscount(double ignoredNumber) {
        
    }
    
    @Override
    public double getDiscountAmount(double itemQuanity, double itemCost){
        if(itemQuanity%2==0){
            this.totalDiscount=(itemQuanity/2)*itemCost;
        } else if ((itemQuanity-1)%2==0){
            this.totalDiscount=((itemQuanity-1)/2)*itemCost;
        }
        return totalDiscount;
    }
    
    @Override
    public double getTotalCost(double itemQuanity, double itemCost){
        if(itemQuanity%2==0){
            this.totalDiscount=(itemQuanity/2)*itemCost;
        } else if ((itemQuanity-1)%2==0){
            this.totalDiscount=((itemQuanity-1)/2)*itemCost;
        }
        return (itemQuanity*itemCost)-totalDiscount;
    }
    
}

    

