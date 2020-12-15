package com.observer.pattern;

public class ObserverPattern {
    public static void main(String[] args) {
        Customer c1  = new Customer();
        c1.setCustomerName("venky");
        Customer c2  = new Customer();
        c2.setCustomerName("swaroop");

        Product iphone6 = new Product();
        iphone6.setProductName("Iphone 6");

        c1.setProductObservable(iphone6);
        c2.setProductObservable(iphone6);

        iphone6.setProductAvailable(false);
        iphone6.registerSubscribers(c1);
        iphone6.registerSubscribers(c2);

        // if iphone 6 is available after few days
        iphone6.setProductAvailable(true);
        System.out.println(c1.getProductObservable().getProductName());

        iphone6.setProductAvailable(false);
        System.out.println("--------------------");
        iphone6.unRegisterSubscribers(c2);
        iphone6.setProductAvailable(true);

    }
}
