package ImportantProgramms;

import java.util.Scanner;

public class NearestPrime {
    public static int nearestPrime(int n){
        int rightPrime=0;
        int leftPrime=0;

        if (checkPrime(n)){
            return n;
        }

        for(int i=n+1;;i++){
            if(checkPrime(i)){
                rightPrime=i;
                break;
            }
        }

        for(int i=n-1;;i--){
            if(checkPrime(i)){
                leftPrime=i;
                break;
            }
        }

        if(n-leftPrime > n-rightPrime){
            return rightPrime;
        }
        else return leftPrime;
    }

    public static boolean checkPrime(int n){


        if (n<=0){
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nearestPrime(n));
    }
}
