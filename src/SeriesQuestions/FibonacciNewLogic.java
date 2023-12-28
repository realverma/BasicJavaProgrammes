package SeriesQuestions;

import java.util.Scanner;

public class FibonacciNewLogic
{
    public static void print(int n){
        if (n==1){
            System.out.print(0);
            return;
        }
        int n1=0;
        int n2=1;

        System.out.print(n1+" "+ n2);

        for (int i=1;i<=n-2;i++){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }

}
