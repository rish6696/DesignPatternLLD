package DesignPatterns.ObserverPattern.Store;
import DesignPatterns.ObserverPattern.IphoneObservable.IphoneObservable;
import DesignPatterns.ObserverPattern.MobileScreenObserver.MobileScreenObserver;
import DesignPatterns.ObserverPattern.Observable.StockObservable;
import DesignPatterns.ObserverPattern.Observer.StockObserver;


public class Store {

    /* 
       In this pattern, there is a an Observable Class, Which is being observed by an Observer class.
       Observable class has a list of observers, who are observing that particular class. 
       Similarly Observer class has a reference to a observable. There is a HAS a relationship there.
     * 
     */
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();
        StockObserver mobileScreenObserverIphone = new MobileScreenObserver(iphoneObservable);

        iphoneObservable.addObserver(mobileScreenObserverIphone);

        iphoneObservable.setData(89);
    }
    
}
