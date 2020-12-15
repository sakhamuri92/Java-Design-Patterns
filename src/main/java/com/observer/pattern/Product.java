package com.observer.pattern;

import java.util.ArrayList;

public class Product implements  Observable{
    public ArrayList<Customer> customers;
    public String productName;
    public boolean available;
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product() {
        customers = new ArrayList<Customer>();
    }

    public void registerSubscribers(Customer customer) {
        customers.add(customer);
    }

    public void unRegisterSubscribers(Customer customer) {
        customers.remove(customer);
    }

    public void notifySubscribers() {
        for (Customer c:getCustomers()
             ) {
            c.update(getProductName());
        }
    }

    public void setProductAvailable(boolean available) {
        this.available = available;
        if(this.available) {
            notifySubscribers();
        }
    }
}
