package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the advance payment to be given");
        int advanceAmout=Scanner.nextInt();
        CalculationOfWorkerWages[] calculationOfWorkerWages=new CalculationOfWorkerWages[5];
        for(int iterator=0;iterator<5;iterator++) {
            calculationOfWorkerWages[iterator]=new CalculationOfWorkerWages();
            calculationOfWorkerWages[iterator].depositingAdvanceAmountToWorkersAccount(advanceAmout);
            int totalAmountPaidForEachWorkersForSlab = calculationOfWorkerWages[iterator].calculateTotalAmountForEachWorkerworkingOnSlabAfterCompletionofSlab(10);
            System.out.println("amount paid to each worker for slab including advanceamount" + totalAmountPaidForEachWorkersForSlab);
            System.out.println("total " + calculationOfWorkerWages[iterator].getTotalAmountPaidForAllWorkersForSlabConstruction());
        }

    }
}