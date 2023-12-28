package Arrays;

public class OddPrimeInArr
{
    //Print odd prime in an array
    public static boolean checkPrime(int n){
        int count=0;

        for (int i=2;i<=n/2 ;i++ ){
            if (n%i==0){
                count++;
            }
        }
        if(count!=0 || n<=1){
            return false;
        }
        return true;
    }

    public static boolean checkEven(int n){
        if((n & 1)==0){
            return true;
        }
        return false;
    }

    public static void printOddPrime(int n[]){
        for(int i=0;i<=n.length-1;i++){
            if(!checkEven(n[i]) && checkPrime(n[i])){
                System.out.println(n[i]);
            }
        }
    }
    public static void main(String[] args) {
        int n[]={1,5,2,0,8,7,9,23,78};
        printOddPrime(n);
    }
}
