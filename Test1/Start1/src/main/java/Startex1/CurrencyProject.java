package Startex1;
import
public class CurrencyProject {
    private StartProject;

    public CurrencyProject(StartProject){
        this.StartProject= Startproject;

    }
    public double convert(double amount,String fromCurrencyRate,String toCurrencyRate){
        double rate= StartProject.getRate(fromCurrencyRate,toCurrencyRate);
        return amount * rate;
    }
}
