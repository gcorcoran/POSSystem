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
public class KohlsReceiptMessages implements  ReceiptMessagesStrategy{

    private final String RECEIPT_START_MSG = "Welcome to Kohls!";
    private final String RECEIPT_END_MSG = "Thank you for shopping at Kohls!";

    @Override
    public String getReceiptStartMsg() {
        return RECEIPT_START_MSG;
    }

    @Override
    public String getReceiptEndMsg() {
        return RECEIPT_END_MSG;
    }

}
