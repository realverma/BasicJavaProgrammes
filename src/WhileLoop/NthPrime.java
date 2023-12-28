package WhileLoop;

public class NthPrime
{
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

    public  static  void printNthPrime(int n){

        int count =0;

        for (int i=1;i<=100;i++){
            if (checkPrime(i)){
                count++;
                    if (count==n){
                        System.out.println(i);
                    }

            }
        }
    }

    public static void main(String[] args) {
        printNthPrime(5);
    }
}
