/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem;

/**
 *
 * @author gcorcoran
 */
public class LineItem {

    private Product product;

    private double quantity;

    public LineItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.product.getUPC() + " " + this.product.getItemDiscription() + " " + this.product.getItemPrice() + " " + this.getQuantity() + " " + this.product.getDiscountAmount(quantity) + ((this.product.getItemPrice()*this.getQuantity())-this.product.getDiscountAmount(quantity));
    }
    
    
    

 


     

    
    
    
}
