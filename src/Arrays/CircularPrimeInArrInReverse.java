package Arrays;

public class CircularPrimeInArrInReverse
{
    public static void printCircularPrimeInArrInReverse(int n[]){
        for (int i =0;i<=n.length-1;i++)
        if (CircularPrimeInArr.checkCircularprime(n[i])){
            System.out.println(n[i]+" : "+reverse(n[i]));
        }
    }

    public static int reverse(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            res=res*10+rem;
            n/=10;
        }
        return res;
    }

    public static void main(String[] args) {
        int n[]={1,0,5,4,2,8,9,197,31,753,193,22};
        printCircularPrimeInArrInReverse(n);
    }
}
