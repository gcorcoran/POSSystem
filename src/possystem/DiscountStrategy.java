

package possystem;

/**
 *
 * @author Greg
 */
public interface DiscountStrategy {

    double getDiscountAmount();

    double getTotalCost(double itemCost, double itemQuanity);
    

    
}
