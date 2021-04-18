public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        BankAccount account2 = new BankAccount();
        account.deposit("checking", 100);
        account.deposit("savings", 100);
        account.withdraw("checking", 120);
        account.withdraw("checking", 75);
        account.withdraw("savings", 120);
        account.withdraw("savings", 75);
        System.out.println("Checking total: $" + account.getChecking());
        System.out.println("Savings total: $" + account.getSavings());

        account2.deposit("checking", 500);
        BankAccount.checkTotals();

    }
}
