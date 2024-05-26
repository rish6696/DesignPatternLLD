package DesignPatterns.ObserverPattern.MobileScreenObserver;

import DesignPatterns.ObserverPattern.Observer.StockObserver;
import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class MobileScreenObserver implements StockObserver  {

    StockObservable observable;

    public MobileScreenObserver(StockObservable observable){
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Some Value has changed in Iphone stock, curent value is :"+this.observable.getData());
    }
    
}
