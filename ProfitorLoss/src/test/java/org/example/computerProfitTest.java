package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class computerProfitTest {

    computerProfit CPT;
    @BeforeEach
    void setUp() {
      CPT  = new computerProfit();
    }

    @Test
    void getProfit() {
        double ActualProfit = CPT.getProfit(10, 2000, 20000);
        double ExpectedProfit = 6000;

        assertEquals(ExpectedProfit,ActualProfit);
    }
}