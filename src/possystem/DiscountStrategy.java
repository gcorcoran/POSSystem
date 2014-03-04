

package possystem;

/**
 *
 * @author Greg
 */
public interface DiscountStrategy {

    public abstract double getDiscountAmount(double itemQuantity, double itemCost);

    public abstract double getTotalCost(double itemCost, double itemQuantity);
    

    
}
