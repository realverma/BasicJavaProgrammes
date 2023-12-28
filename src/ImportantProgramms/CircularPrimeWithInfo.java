package ImportantProgramms;

import java.util.Scanner;

public class CircularPrimeWithInfo {
    public static void printCircularPrime(int n) {
        int count = 0;
        int noOfPrime = 0;
        int temp = n;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        for (int i = 1; i <= count; i++) {
            if (checkPrime(n)) {
                noOfPrime++;
                System.out.println(n + "-->Prime ");
                int lastDigit = n % 10;
                int firstDigit = n / 10;
                n = lastDigit * pow(10, count - 1) + firstDigit;
            } else {
                System.out.println(n + "-->Not Prime ");
                int lastDigit = n % 10;
                int firstDigit = n / 10;
                n = lastDigit * pow(10, count - 1) + firstDigit;

            }
        }
        System.out.println("No of Digits " + count);
        System.out.println("No of Primes " + noOfPrime);
        if (count == noOfPrime) {
            System.out.println("Circular Prime");
        } else {
            System.out.println("Not Circular Prime");
        }
    }

    public static boolean checkPrime(int n){
        if (n<=1){
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else if (n%2==0 || n%3==0) {
            return false;
        }
        for (int i=5;i<=Math.sqrt(n);i=i+2){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int pow(int b,int p){
        int result=1;
        for (int i=1;i<=p;i++){
            result*=b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printCircularPrime(n);
    }
}
