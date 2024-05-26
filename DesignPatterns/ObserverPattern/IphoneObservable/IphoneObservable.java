package DesignPatterns.ObserverPattern.IphoneObservable;
import DesignPatterns.ObserverPattern.Observable.StockObservable;
import DesignPatterns.ObserverPattern.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {

    List<StockObserver> observers;
    int count;

    public IphoneObservable(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(StockObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public int getData() {
        // TODO Auto-generated method stub
        return this.count;
    }

    @Override
    public void notifyObservers() {
        for(StockObserver o:observers){
            o.update();
        }
    }

    @Override
    public void removeObserver(StockObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void setData(int count) {
        this.count = count;
        this.notifyObservers();
    }
    
}
