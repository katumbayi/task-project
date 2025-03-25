package Startex;

public class StartProject {
    public double getRate(String fromCurrencyRate, String ToCurrencyRate){

        if (fromCurrencyRate.equals("UGX") && ToCurrencyRate.equals("USD")) {
            return 3.657;
        }
        if (fromCurrencyRate.equals("EUR") && ToCurrencyRate.equals("USD")) {
            return 1.18;
        }
        if (fromCurrencyRate.equals("USA") && ToCurrencyRate.equals("GBP")) {
            return 0.75;
        }
        if (fromCurrencyRate.equals("FC") && ToCurrencyRate.equals("USD")) {
            return 2.100;

        }

    }
}
