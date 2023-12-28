package InputsProgramms;

import java.util.Scanner;

public class Add {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st no.");
        if (sc.hasNextInt()){
            int a=sc.nextInt();
            System.out.println("Enter 2nd no");
            int b=sc.nextInt();
            Add a1=new Add();
            System.out.println(a1.add(a,b));
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
