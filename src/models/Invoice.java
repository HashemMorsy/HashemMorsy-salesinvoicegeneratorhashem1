/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.ArrayList;
import view.SalesInvoiceFrame;

/**
 *
 * @author hshemmorsy
 */
public class Invoice {
    private int num1;
    private String customer;
    private Date date1;
    private ArrayList<Line> lines;

    public Invoice(int num, String customer, Date date) {
        this.num1 = num;
        this.customer = customer;
        this.date1 = date;
    }
    
    public String toCSV() {
        return num1 + "," + SalesInvoiceFrame.sdf.format(date1) + "," + customer;
    }
    
    public int getNum() {
        return num1;
    }

    public void setNum(int num) {
        this.num1 = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date1;
    }

    public void setDate(Date date) {
        this.date1 = date;
    }

    public ArrayList<Line> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }
    
    public double getTotal() {
        double total = 0.0;
        for (Line line : getLines()) {
            total += line.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num1 + ", customer=" + customer + ", date=" + date1 + '}';
    }
    
    
    
}
