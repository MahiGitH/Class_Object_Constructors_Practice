public class BankAccount {
    public double accountBalance;
    public String accountHolderName;

    // Class constructor
    public BankAccount(double balance, String name){
        accountBalance = balance;
        accountHolderName = name;
    }
    public void deposit(double amount){
        accountBalance += amount;
    }

    public void withdrawal(double amount){
        accountBalance -= amount;
    }

    public void printAccountDetail() {
        System.out.println("The account holder name is " + this.accountHolderName + " and the account balance is: "+ this.accountBalance);
    }

}
