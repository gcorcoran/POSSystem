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
public class Scanner {
    
    DataStorageStrategy data = new FakeDB();
    

    public Product getProductData(String UPC) {
        boolean needItem = true;
        int a = 0;
        while(needItem){
            if(UPC == null ? data.getUPC(a) == null : UPC.equals(data.getUPC(a))){
            return data.getProductInfo(a);
        }
            a++;
        }
        return data.getProductInfo(14);
    }
    
    

    
    
    
}
