package Arrays;

public class PrimeInArr
{
    //prime numbers in an array
    public static boolean checkPrime(int n){
        int count=0;

        for (int i=2;i<=n/2 ;i++ ){
            if(n%i==0){
                count++;
            }
        }
        if(count!=0 || n<=1){
            return false;
        }
        return true;
    }
    public static void primeInArr(int n[]){

        for(int i=0;i<=n.length-1;i++){
            if (checkPrime(n[i])){
                System.out.print(n[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n[]={14,5,8,2,1,0,6};
        primeInArr(n);
    }

}
