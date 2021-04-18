package observer;

import java.util.ArrayList;

public class ExchangeRates implements Observable {

    private ArrayList<Observer> observers;
    private double eur;
    private double usd;
    private double gbp;

    public ExchangeRates() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {

        int observerIndex = observers.indexOf(observer);

        System.out.println("Observer " + (observerIndex+1) + " removed");
        observers.remove(observerIndex);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(eur, usd, gbp);
        }
    }

    public void setEUR(double eur) {
        this.eur = eur;
        notifyObservers();
    }

    public void setUSD(double usd) {
        this.usd = usd;
        notifyObservers();
    }

    public void setGBP(double gbp) {
        this.gbp = gbp;
        notifyObservers();
    }
}
