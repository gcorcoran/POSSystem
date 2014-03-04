

package possystem;

public class POSSystem {

    public static void main(String[] args) {

        DataStorageStrategy db = new FakeDB();
        LineItem li = new LineItem(db.getProductInfo("A100"),2);
        System.out.println(li.toString());
        
        
    }
    
    
    
}
