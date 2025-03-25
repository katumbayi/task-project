package org.example;

public class computerProfit {
    public double getProfit(double Quantity, double UnitPrice, double SellingPrice){
        double Profit = (SellingPrice - UnitPrice) * Quantity;
        return Profit;
    }
}
