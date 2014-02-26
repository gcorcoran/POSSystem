

package possystem;

/**
 *
 * @author Greg
 */
public interface DiscountStrategy {

    double getDiscountAmount();

    double getItemCost();

    double getItemQuanity();

    double getTotalCost();

    void setItemCost(double itemCost);

    void setItemQuanity(double itemQuanity);
    
}
