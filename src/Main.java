public class Main {
    public static void main(String[] args) {
        // Bank Account
        BankAccount account1 = new BankAccount(500.0, "David");
        account1.deposit(100.0);
        account1.printAccountDetail();

        // Bank Transfer
        BankAccount account2 = new BankAccount(5000.0, "Marry");
        BankAccount account3 = new BankAccount(300.0, "Joe");

        account2.withdrawal(100.0);
        account3.deposit(100.0);

        account2.printAccountDetail();
        account3.printAccountDetail();




    }
}