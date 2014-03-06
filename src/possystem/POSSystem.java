

package possystem;

public class POSSystem {

    public static void main(String[] args) {

        //DataStorageStrategy db = new FakeDB();
        //LineItem li = new LineItem(db.getProductInfo("A100"),2);
        //System.out.println(li.toString());
        
        Customer name = new Customer("Joe");
        DataStorageStrategy db = new FakeDB();
        ReceiptMessagesStrategy messages= new KohlsReceiptMessages();
        Receipt tester = new Receipt(name, db, messages);
        
        tester.addLineItem("A100", 2);
        tester.addLineItem("A101", 2);
        tester.addLineItem("A102", 2);
        
        System.out.print(tester.printreceipt());
        //tester.printreceipt();
    }
    
    
    
}
