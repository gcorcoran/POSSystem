

package possystem;

public class POSSystem {

    public static void main(String[] args) {
        DiscountStrategy discount = new PercentDiscount(10,1,.1);
        DiscountStrategy bogo = new BuyOneGetOneFreeDiscount(10,2,10);
        DiscountStrategy flat = new FlatDiscount(10,1,2);
        System.out.println("The discount should be 1: " + discount.getDiscountAmount());
        System.out.println("The total should be 9: " + discount.getTotalCost());
        System.out.println("The discount should be 10: " + bogo.getDiscountAmount());
        System.out.println("The total should be 10: " + bogo.getTotalCost());
        System.out.println("The discount should be 2: " + flat.getDiscountAmount());
        System.out.println("The total should be 8: " + flat.getTotalCost());
    }
    
    
    
}
