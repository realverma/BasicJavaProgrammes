package Arrays;

import ImportantProgramms.CircularPrimeWithInfo;

public class CircularPrimeInArr
{
    public static int countDigits(int n){
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        else if(n==2 || n==3){
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
    public static int pow(int b,int p){
        int res=1;
        for (int i=1;i<=p;i++){
            res*=b;
        }
        return res;
    }
    public static boolean checkCircularprime(int n){
        int count=countDigits(n);
        if (n>0) {
            for (int i = 1; i <= count; i++) {
                if (checkPrime(n)) {
                    int lastDigit = n % 10;
                    int firstDigit = n / 10;
                    n = lastDigit * pow(10, count - 1) + firstDigit;
                } else return false;
            }
            return true;
        }
        return false;
    }

    public static void printCircularPrimeInArr(int n[]){
        for (int i=0;i<=n.length-1;i++){
            if (checkCircularprime(n[i])){
                System.out.println(n[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n[]={1,2,3,0,0,5,9,78,31,197,852};

        printCircularPrimeInArr(n);
    }
}
