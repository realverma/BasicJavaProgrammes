package Objects;

public class Customer
{
    String name;
    int bankCode,pin,balance;
    long phno;
    boolean panCard;

    Customer(String name, int bankCode, boolean panCard){
        this.name=name;
        this.bankCode=bankCode;
        this.panCard=panCard;
    }

    void setPin(int pin){
        if (pin>=1000 && pin<=9999){
            this.pin=pin;
            System.out.println("Pin Updated");
        }
        else {
            System.out.println("You Must Enter 4 digit Pin");
        }
    }
    void Deposit(int pin , int amount){
        if (pin>=1000 && pin<=9999 && this.pin==pin){
            this.balance=this.balance+amount;
            System.out.println(amount+ " Deposited");
        }
        else {
            System.out.println("Invalid PIN");
        }
    }

    void checkBalace(int pin){
        if (this.pin==pin){
            System.out.println("Balance : "+this.balance);
        }
        else {
            System.out.println("Invalid PIN");
        }
    }

    void Withdraw(int pin, int amount){
        if (this.pin==pin){
            if (panCard || amount<50000){
                this.balance=this.balance-amount;
                System.out.println(amount+" Withdrawn");
                if ((this.bankCode==2) || (this.bankCode==3) && this.balance<10000){
                    System.out.println("Low Minimum balance");
                    System.out.println(10000-this.balance+ " must be deposited");
                }
            }
            else {
                System.out.println("Link PAN");
            }
        }
        else {
            System.out.println("Invalid PIN");
        }
    }

    void Details(){
        System.out.println("Name : "+this.name);
        System.out.println("Bank Code : "+this.bankCode);
        System.out.println("Pan Card" +this.panCard);
    }

    public static void main(String[] args) {
        Customer c1=new Customer("Neeraj", 456,true);
        c1.setPin(1259);
        c1.Deposit(1259,50000);
        c1.Withdraw(1259,
                2000);
        c1.checkBalace(1259);
        c1.Details();
    }
}
