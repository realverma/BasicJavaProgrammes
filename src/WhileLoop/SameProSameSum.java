package WhileLoop;

import java.util.Scanner;

public class SameProSameSum
{
    public static void print(int n){

        int pro=1;
        int npro=n;
        while(npro>0){
            int lastDigit=npro%10;
            pro=pro*lastDigit;
            npro=npro/10;

        }

        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;

        }
        System.out.println(sum +" "+pro);
        if (sum==pro){
            System.out.println("Magic Number");
        }
        else {
            System.out.println("Not");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        print(n);
    }
}
