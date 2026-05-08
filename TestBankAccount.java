package Anes;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Ali", 1000);

        account.deposit(500);
        account.withdraw(300);

        account.setOwnerName("Ahmed");
        account.setBalance(2000);

        System.out.println(account);
    }
}
