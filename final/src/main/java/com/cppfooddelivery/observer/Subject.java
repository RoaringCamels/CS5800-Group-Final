package com.cppfooddelivery.observer;

public interface Subject {
    void resgisterObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
