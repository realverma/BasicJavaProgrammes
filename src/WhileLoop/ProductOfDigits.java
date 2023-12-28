package WhileLoop;

import java.util.Scanner;

public class ProductOfDigits
{
    public static void print(int n){

        int pro=1;
        while(n>0){
            int lastDigit=n%10;
            pro=pro*lastDigit;
            n=n/10;

        }
        System.out.println(pro);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        print(n);
    }
}
