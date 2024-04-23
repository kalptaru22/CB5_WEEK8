package bankaccountinheritance;

public class SavingAccount extends BankAccount{
    /*
    Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred.
     */
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.withdrawFromAccount(700);

    }
    public void withdrawFromAccount(double withdraw){
        double balance = 99;
        if(balance>=100){
            System.out.println("Withdrawal is allowed ");
        }else {
            System.out.println("Balance low for Withdrawal");
        }
    }
}
