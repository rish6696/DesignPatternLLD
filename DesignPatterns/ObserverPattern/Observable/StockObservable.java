package DesignPatterns.ObserverPattern.Observable;
import DesignPatterns.ObserverPattern.Observer.*;;

public interface StockObservable {
    public void addObserver(StockObserver observer);
    public void removeObserver(StockObserver observer);
    public void notifyObservers();
    public void setData(int count);
    public int  getData();
}
