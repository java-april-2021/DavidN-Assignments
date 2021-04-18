import java.util.Random;

public class BankAccount{
    private String accountNum = "";
    private double checkingBal;
    private double savingsBal;
    private static int accountsCount;
    private static double accountsTotalCash;

    private static Random rand = new Random();
    public BankAccount(){
        this.accountNum = BankAccount.randAccount();
        System.out.println("Bank account number: " + accountNum);
        accountsCount += 1;
    }

    private static String randAccount(){
        String account = "";
        for(int i = 0; i < 10; i++){
            account += Integer.toString(rand.nextInt(10));
        }
        return account;
    }

    public double getChecking(){
        return checkingBal;
    }

    public double getSavings(){
        return savingsBal;
    }

    public void deposit(String acc, double amnt){
        if(acc.equals("checking") || acc.equals("Checking")){
            this.checkingBal += amnt;
            System.out.println("Your checking balance: $" + checkingBal);
            accountsTotalCash += amnt;
        }
        else if(acc.equals("saving") ||acc.equals("savings") || acc.equals("Savings") || acc.equals("Saving")){
            this.savingsBal += amnt;
            System.out.println("Your savings balance: $" + savingsBal);
            accountsTotalCash += amnt;
        }
    }

    public void withdraw(String acc, double amnt){
        if(acc.equals("checking") || acc.equals("Checking")){
            if(amnt <= this.checkingBal && amnt > 0){
            this.checkingBal -= amnt;
            System.out.println("Your checking balance: $" + this.checkingBal);
            accountsTotalCash -= amnt;
            }
            else{
                System.out.println("Insufficient funds. You have: $" + this.checkingBal);
            }
        }
        else if(acc.equals("saving") ||acc.equals("savings") || acc.equals("Savings") || acc.equals("Saving")){
            if(amnt <= this.savingsBal && amnt > 0){
                this.savingsBal -= amnt;
                System.out.println("Your savings balance: $" + this.savingsBal);
                accountsTotalCash -= amnt;
                }
            else{
                System.out.println("Insufficient funds. You have: $" + this.savingsBal);
            }
        }
    }

    public static void checkTotals(){
        System.out.println("Total accounts: " + accountsCount);
        System.out.println("Total cash in all accounts: $" + accountsTotalCash);
    }

}