package Startex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurrencyProjectTest {
     CurrencyProject cost3;
    @BeforeEach
    void setUp() {
       cost3 = new CurrencyProject("30",3000);
    }

    @Test
    void getItermCost() {
        double profit = 500000;
        assertEquals(profit,cost3.GetItermCost(500));

    }

    @Test
    void conert() {
         double profit = 100;
         assertEquals(profit, cost3.conert(3000,"USD","EUR"));
    }
}