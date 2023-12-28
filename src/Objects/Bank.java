package Objects;

public class Bank {
    String name;
    int bankCode;
    int pin;
    int balance;
    boolean panCard;
    double phno;

    Bank( String n, int bcode,int p,int bal, boolean pan, double ph ){
        this.name= n;
        this.bankCode=bcode;
        this.pin=p;
        this.setPin(pin);
        this.panCard=pan;
        this.balance=bal;
        this.phno=ph;
    }
    void setPin(int p){
        this.pin=p;
    }

    public static void main(String[] args) {
        Bank b2=new Bank("Neeraj", 1456,4444,50000,true,9896587);
        System.out.println(b2.pin);
    }
}
