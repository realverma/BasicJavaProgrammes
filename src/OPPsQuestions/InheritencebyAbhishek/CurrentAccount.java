package OPPsQuestions.InheritencebyAbhishek;

public class CurrentAccount extends Account
{
    double overdraftLimit;

    @Override
    public double withdraw(double amount) {
        if (balance <= overdraftLimit) {
            return this.balance = this.balance - amount;
        }
        return balance;
    }
}
