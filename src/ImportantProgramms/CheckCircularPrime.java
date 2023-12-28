package ImportantProgramms;

import java.util.Scanner;

public class CheckCircularPrime
{
    public static boolean checkCircularPrime(int n){
        int count=0;
        int temp=n;

        while (temp>0){
            count++;
            temp=temp/10;
        }
        for (int i=1;i<=count;i++){
            if ( checkPrime(n)){
                int lastDigit=n%10;
                int firstDigits=n/10;
                n=lastDigit*pow(10,count-1)+firstDigits;
            }
            else return false;
        }
        return true;

    }

    public static boolean checkPrime(int n){


        if (n<=1){
            return false;
        }
        else if (n==2 || n==3) {
            return true;
        }
        else if (n%2==0 || n%3==0) {
            return false;
        }
        for (int i=5;i<=Math.sqrt(n);i=i+2){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int pow(int b, int p){
        int res=1;
        for (int i=1;i<=p;i++){
            res*=b;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkCircularPrime(n));

    }
}
