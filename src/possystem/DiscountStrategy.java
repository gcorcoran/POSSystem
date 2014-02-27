

package possystem;

/**
 *
 * @author Greg
 */
public interface DiscountStrategy {

    double getDiscountAmount(double itemQuantity, double itemCost);

    double getTotalCost(double itemCost, double itemQuantity);
    

    
}
