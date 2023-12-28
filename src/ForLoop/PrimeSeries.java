package ForLoop;

public class PrimeSeries
{
    public static boolean checkPrime(int n){
        if (n<=1){
            return  false;
        }
        else if (n==2 || n==3) {
            return  true;
        }
        else if (n%2==0 || n%3==0) {
            return false;
        }
        for (int i=5;i<=Math.sqrt(n);i=i+1){
         if (n%i==0){
                     return false;
        }
        }
        return true;
    }
    public static void printPrime(int n){
        for (int i=1;i<=n;i++){
            if (checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        printPrime(100);
    }


}