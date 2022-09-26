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
public class InvoiceHeaderDialog extends JDialog {
    private JTextField custName;
    private JTextField invDate;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton okB;
    private JButton cancelB;

    public InvoiceHeaderDialog(SalesInvoiceFrame frame) {
        custNameLbl = new JLabel("Customer Name:");
        custName = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDate = new JTextField(20);
        okB = new JButton("OK");
        cancelB = new JButton("Cancel");
        
        okB.setActionCommand("newInvoiceOK");
        cancelB.setActionCommand("newInvoiceCancel");
        
        okB.addActionListener(frame.getListener());
        cancelB.addActionListener(frame.getListener());
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        add(invDate);
        add(custNameLbl);
        add(custName);
        add(okB);
        add(cancelB);
        setModal(true);
        pack();
        
    }

    public JTextField getCustNameField() {
        return custName;
    }

    public JTextField getInvDateField() {
        return invDate;
    }
    
}
