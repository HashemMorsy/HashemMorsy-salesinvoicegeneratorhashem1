/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hshemmorsy
 */
public class InvoiceLineDialog extends JDialog{
    private JTextField itemName ;
    private JTextField itemCount ;
    private JTextField itemPrice ;
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    private JButton okB ;
    private JButton cancelB ;
    
    public InvoiceLineDialog(SalesInvoiceFrame frame) {
        itemName  = new JTextField(20);
        itemNameLbl = new JLabel("Item Name");
        
        itemCount = new JTextField(20);
        itemCountLbl = new JLabel("Item Count");
        
        itemPrice = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price");
        
        okB = new JButton("OK");
        cancelB = new JButton("Cancel");
        
        okB.setActionCommand("newLineOK");
        cancelB.setActionCommand("newLineCancel");
        
        okB.addActionListener(frame.getListener());
        cancelB.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLbl);
        add(itemName);
        add(itemCountLbl);
        add(itemCount);
        add(itemPriceLbl);
        add(itemPrice);
        add(okB);
        add(cancelB);
        setModal(true);
        pack();
    }

    public JTextField getItemNameField() {
        return itemName;
    }

    public JTextField getItemCountField() {
        return itemCount;
    }

    public JTextField getItemPriceField() {
        return itemPrice;
    }
}
