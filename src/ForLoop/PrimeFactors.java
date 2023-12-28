package ForLoop;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeFactors {
    public static void Prime(int n){
        int count=0;
        for (int i=1;i<=n>>2;i++){
            if (n%i==0){
                count++;
            }
            if (count==2){
                System.out.println(count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Prime(n);
    }

}
