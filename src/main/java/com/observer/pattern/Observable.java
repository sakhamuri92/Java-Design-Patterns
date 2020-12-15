package com.observer.pattern;

public interface Observable {
    public void registerSubscribers(Customer customer);
    public void unRegisterSubscribers(Customer customer);
    public void notifySubscribers();
}
