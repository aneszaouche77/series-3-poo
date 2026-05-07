package Anes;

class BankAccount {
    private String ownerName;
    private double balance;

    
    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public String toString() {
        return "BankAccount [Owner = " + ownerName +
               ", Balance = " + balance + "]";
    }
}