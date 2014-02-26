

package possystem;

/**
 *
 * @author Greg
 */
public class PercentDiscount implements DiscountStrategy {
    
    private double itemCost;
    private double itemQuanity;
    private double percentDiscount;

    public PercentDiscount(double itemCost, double itemQuanity, double percentDiscount) {
        this.itemCost = itemCost;
        this.itemQuanity = itemQuanity;
        this.percentDiscount = percentDiscount;
    }

    @Override
    public double getDiscountAmount(){
        return itemCost * itemQuanity * percentDiscount;
    }
    
    @Override
    public double getTotalCost(){
        return (itemCost * itemQuanity) - (itemCost * itemQuanity * percentDiscount);
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

    
    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }
    
    
    
}
