package ForLoop;

import java.util.Scanner;

public class CheckPrimeFromLoop
{
    public static void printPrimeSeries(int n){
        for (int i=1;i<=n;i++){

        int count=0;
        for (int j=2;j<=i-1;j++){
            if (i%j==0){
                count++;
            }
        }
        if (i>=2 && count==0){
            System.out.print(i+" ");
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPrimeSeries(n);
    }
}
