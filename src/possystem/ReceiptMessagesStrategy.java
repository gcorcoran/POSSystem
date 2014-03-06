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
public interface ReceiptMessagesStrategy {
    
    public abstract String getReceiptStartMsg();
    
    public abstract String getReceiptEndMsg();
    
    public abstract String getReceiptColHeader();
    
    public abstract String getTotalDue();
    
    public abstract String getGreeting();
}
