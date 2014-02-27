

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
    public double getDiscountAmount(double itemQuantity, double itemCost){
        if(itemQuantity%2==0){
            this.totalDiscount=(itemQuantity/2)*itemCost;
        } else if ((itemQuantity-1)%2==0){
            this.totalDiscount=((itemQuantity-1)/2)*itemCost;
        }
        return totalDiscount;
    }
    
    @Override
    public double getTotalCost(double itemQuantity, double itemCost){
        if(itemQuantity%2==0){
            this.totalDiscount=(itemQuantity/2)*itemCost;
        } else if ((itemQuantity-1)%2==0){
            this.totalDiscount=((itemQuantity-1)/2)*itemCost;
        }
        return (itemQuantity*itemCost)-totalDiscount;
    }
    
}

    

