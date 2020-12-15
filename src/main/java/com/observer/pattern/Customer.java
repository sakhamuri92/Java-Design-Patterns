package com.observer.pattern;

public class Customer implements Observer{
    public String customerName;
    public Product productObservable;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Product getProductObservable() {
        return productObservable;
    }

    public void setProductObservable(Product productObservable) {
        this.productObservable = productObservable;
    }

    public void update(String productName) {
        System.out.println("Hello "+ customerName + productName + "is Available");
    }
}
