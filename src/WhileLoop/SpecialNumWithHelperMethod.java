package WhileLoop;

public class SpecialNumWithHelperMethod
{
    public static int fact(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public  static boolean checkSpecialNum(int n){
        int temp=n;
        int sum=0;

        while (temp>0){
            int rem=temp%10;
            sum=sum+fact(rem);
            temp=temp/10;
        }
        if (sum==n){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(checkSpecialNum(145));
    }
}
