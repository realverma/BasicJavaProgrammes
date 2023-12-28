package WhileLoop;

import java.util.Scanner;

public class EvenDigits
{
    public static void print(int n){

        while(n>0){
            int lastDigit=n%10;
            if (lastDigit%2==0){
                System.out.println(lastDigit);
            }
            n=n/10;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        print(n);
    }
}
