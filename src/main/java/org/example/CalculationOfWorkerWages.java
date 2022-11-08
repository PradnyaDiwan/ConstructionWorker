package org.example;

public class CalculationOfWorkerWages extends ConstructionWorker{
    private static int totalAmountPaidForAllWorkersForSlabConstruction;

    public CalculationOfWorkerWages() {
        super();

    }

    public CalculationOfWorkerWages(String phoneNumber, String fullName, String accountNumber, String adharCardNumber) {

        super(phoneNumber, fullName, accountNumber, adharCardNumber);
    }

    public int getTotalAmountPaidForAllWorkersForSlabConstruction() {
        return totalAmountPaidForAllWorkersForSlabConstruction;
    }

    public void setTotalAmountPaidForAllWorkersForSlabConstruction(int totalAmountPaidForAllWorkersForSlabConstruction) {
        this.totalAmountPaidForAllWorkersForSlabConstruction = totalAmountPaidForAllWorkersForSlabConstruction;
    }

    void depositingAdvanceAmountToWorkersAccount(int amount){
         this.bankBalance=this.bankBalance+amount;
      }
    int calculateTotalAmountForEachWorkerworkingOnSlabAfterCompletionofSlab(int days){
        int amount=(1500*days);
        this.bankBalance=this.bankBalance+amount-500;
        this.totalAmountPaidForAllWorkersForSlabConstruction+=amount;
        return amount;
    }
}
