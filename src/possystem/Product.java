
package possystem;

/**
 *
 * @author Greg
 */
public class Product {
    
    private String UPC;
    private double itemPrice;
    private String itemDiscription;
    private DiscountStrategy discount;

    public Product(String UPC, double itemPrice, String itemDiscription, DiscountStrategy discount) {
        this.UPC = UPC;
        this.itemPrice = itemPrice;
        this.itemDiscription = itemDiscription;
        this.discount = discount;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDiscription() {
        return itemDiscription;
    }

    public void setItemDiscription(String itemDiscription) {
        this.itemDiscription = itemDiscription;
    }
    
    
    
}
