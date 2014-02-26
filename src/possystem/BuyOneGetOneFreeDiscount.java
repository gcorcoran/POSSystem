

package possystem;

/**
 *
 * @author Greg
 */
public class BuyOneGetOneFreeDiscount implements DiscountStrategy  {

    private double itemCost;
    private double itemQuanity;
    private double amountDiscount;
    private double totalDiscount;

    public BuyOneGetOneFreeDiscount(double itemCost, double itemQuanity, double amountDiscount) {
        this.itemCost = itemCost;
        this.itemQuanity = itemQuanity;
        this.amountDiscount = amountDiscount;
        if(itemQuanity%2==0){
            this.totalDiscount=(itemQuanity/2)*amountDiscount;
        } else if ((itemQuanity-1)%2==0){
            this.totalDiscount=((itemQuanity-1)/2)*amountDiscount;
        }
    }
    
    @Override
    public double getDiscountAmount(){
        return totalDiscount;
    }
    
    @Override
    public double getTotalCost(){
        return (itemCost * itemQuanity) - totalDiscount;
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

    

