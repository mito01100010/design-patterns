package observer;

public class ExchangeRatesObserver implements Observer{

    private double eur;
    private double usd;
    private double gbp;

    private static int observerIDTracker = 0;
    private final int observerID;

    public ExchangeRatesObserver(Observable ratesGrabber) {

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);
        ratesGrabber.register(this);

    }

    @Override
    public void update(double eur, double usd, double gbp) {

        this.eur = eur;
        this.usd = usd;
        this.gbp = gbp;

        printRates();
    }

    public void printRates(){
        System.out.println(observerID + "\nEUR: " + eur + "\nUSD: " + usd + "\nGBP: " + gbp + "\n");
    }

}
