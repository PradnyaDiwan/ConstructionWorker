package org.example;

public class ConstructionWorker {
   protected String phoneNumber;
   protected String fullName;
   protected String accountNumber;
   protected int bankBalance;
   protected String adharCardNumber;

    public ConstructionWorker() {
        this.phoneNumber = "8152952180";
        this.fullName = "sita";
        this.accountNumber = "132323";
        this.bankBalance = 1000;
        this.adharCardNumber = "122SSD323";
    }

    public ConstructionWorker(String phoneNumber, String fullName, String accountNumber,String adharCardNumber) {
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.bankBalance = 1000;
        this.adharCardNumber = adharCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public String getAdharCardNumber() {
        return adharCardNumber;
    }

    public void setAdharCardNumber(String adharCardNumber) {
        this.adharCardNumber = adharCardNumber;
    }
}
