package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculationOfWorkerWagesTest {
    private CalculationOfWorkerWages calculationOfWorkerWagesForFirstWorker,calculationOfWorkerWagesForSecondWorker;

    @BeforeEach
    public void setUp(){
         calculationOfWorkerWagesForFirstWorker =new CalculationOfWorkerWages();
        calculationOfWorkerWagesForSecondWorker=new CalculationOfWorkerWages();
    }

    @Test
    public void shouldCheckIfTotalAmountPaidIsEqualToFirstWorkerWagesPlusSecondWorkerWages()
    {
        int actual=calculationOfWorkerWagesForFirstWorker.calculateTotalAmountForEachWorkerworkingOnSlabAfterCompletionofSlab(10)+calculationOfWorkerWagesForSecondWorker.calculateTotalAmountForEachWorkerworkingOnSlabAfterCompletionofSlab(10);
        assertEquals(30000,actual);
    }

    @Test
    public void shouldCheckIfTotalAmountPaidIsNotEqualToFirstWorkerWagesPlusSecondWorkerWages()
    {
        int actual=calculationOfWorkerWagesForFirstWorker.calculateTotalAmountForEachWorkerworkingOnSlabAfterCompletionofSlab(10)+calculationOfWorkerWagesForSecondWorker.calculateTotalAmountForEachWorkerworkingOnSlabAfterCompletionofSlab(10);
        assertNotEquals(3000,actual);
    }
}
