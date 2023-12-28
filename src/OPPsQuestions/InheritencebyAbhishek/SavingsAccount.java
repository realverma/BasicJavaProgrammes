package OPPsQuestions.InheritencebyAbhishek;

class SavingsAccount extends Account{

    double interestRate;

    //Calculate Interested
    public double calculateInterest(){
        return balance*this.interestRate;
    }

}