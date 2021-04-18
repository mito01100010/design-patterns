package observer;

public class Main {

    public static void main(String[] args) {

        ExchangeRates exchangeRates = new ExchangeRates();

        ExchangeRatesObserver observer1 = new ExchangeRatesObserver(exchangeRates);

        exchangeRates.setEUR(1.945);
        exchangeRates.setUSD(1.603);
        exchangeRates.setGBP(2.214);

        exchangeRates.unregister(observer1);

        ExchangeRatesObserver observer2 = new ExchangeRatesObserver(exchangeRates);

        exchangeRates.setEUR(0);
        exchangeRates.setUSD(0);
        exchangeRates.setGBP(0);


    }
}
