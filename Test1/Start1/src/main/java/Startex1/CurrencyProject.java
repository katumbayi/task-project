package Startex1;
import  Startex.StartProject;
public class CurrencyProject {
    String StartProject;
    double ItermPrice;

    public CurrencyProject(String StartProject, double ItermPrice) {
        this.StartProject = StartProject;
        this.ItermPrice = ItermPrice;

    }

    public double GetItermCost(int numberOfIterm) {
        double cost = ItermPrice * numberOfIterm;
        return cost;
    }

    public double conert(double ItermPrice, String fromCurrencyRate, String toCurrencyRate) {
        double Currentrate = CurrencyProject.displayRate(fromCurrencyRate, toCurrencyRate, ItermPrice);
        return ItermPrice * Currentrate;
    }

    public static double displayRate(String fromCurrencyRate, String toCurrencyRate, double itermPrice) {
        return 0;
    }

}
