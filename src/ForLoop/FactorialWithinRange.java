package ForLoop;

import java.util.Scanner;

public class FactorialWithinRange
{
    public static void print(int n){
        for (int j=1;j<=n;j++){
        long fact=1;
        for (int i=1;i<=j;i++){
            fact*=i;
        }
        System.out.println(j+" = "+fact);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
