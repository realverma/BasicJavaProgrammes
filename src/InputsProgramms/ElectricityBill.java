package InputsProgramms;

import java.util.Scanner;

public class ElectricityBill {

    int Bill(int units){
        if(units<=100){
            return 0;
        }
        else if (units>=101 && units<=200){
            return (units-100)*5;
        }
        else {
            return 5*100+(units-200)*10;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ElectricityBill e1=new ElectricityBill();
        System.out.println("Enter Units");
        int units=sc.nextInt();
        int total=e1.Bill(units);
        System.out.println("Your Bill is "+total);


    }
}
