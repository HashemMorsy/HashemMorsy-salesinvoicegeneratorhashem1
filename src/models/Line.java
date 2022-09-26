/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hshemmorsy
 */
public class Line {
    private String items;
    private double prices;
    private int count;
    private Invoice invoice;

    public Line(String item, double price, int count, Invoice invoice) {
        this.items = item;
        this.prices = price;
        this.count = count;
        this.invoice = invoice;
    }

    public String toCSV() {
        return invoice.getNum() + "," + items + "," + prices + "," + count;
    }
    
    public String getItem() {
        return items;
    }

    public void setItem(String item) {
        this.items = item;
    }

    public double getPrice() {
        return prices;
    }

    public void setPrice(double price) {
        this.prices = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    public double getTotal() {
        return getCount() * getPrice();
    }

    @Override
    public String toString() {
        return "Line{" + "item=" + items + ", price=" + prices + ", count=" + count + '}';
    }
    
}
