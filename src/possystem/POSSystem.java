

package possystem;

public class POSSystem {

    public static void main(String[] args) {
        DiscountStrategy discount = new PercentDiscount(10,1,.1);
        DiscountStrategy bogo = new BuyOneGetOneFreeDiscount(10,2,10);
        System.out.println("The discount should be 1: " + discount.getDiscountAmount());
        System.out.println("The discount should be 10: " + bogo.getDiscountAmount());
    }
    
    
    
}
