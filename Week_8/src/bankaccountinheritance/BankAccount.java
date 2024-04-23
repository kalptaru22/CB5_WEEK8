package bankaccountinheritance;

public class BankAccount {
    /*
    Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred.
     */
    double deposit;

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdrawFromAccount(89.00);
        bankAccount.deposit = 400;

    }

    public void withdrawFromAccount(double withdraw) {

        System.out.println("Your withdraw Amount is : "+ withdraw);

    }
}
