package OPPsQuestions.InheritencebyAbhishek;

public class Account
{
    String accountNumber;
    double balance;

    //Deposit
    public double deposit(double amount){
        return this.balance=this.balance+amount;
    }

    //Withdraw
    public double withdraw(double amount){
        return this.balance=this.balance-amount;
    }

    //Check balance
    public double getBalance(){
        return this.balance;
    }
    public static void main(String[] args) {
        Account a=new Account();

        System.out.println(a.deposit(5000));
        System.out.println(a.withdraw(2000));
        System.out.println(a.getBalance());
    }
}
