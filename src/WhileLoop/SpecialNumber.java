package WhileLoop;

public class SpecialNumber
{
    public static boolean checkSpecialNum(int n){
        int temp=n;
        int sum=0;
        while (temp>0){
            int rem=temp%10;
            int fact=1;
            for (int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if (sum==n){
            return  true;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(checkSpecialNum(40585));
    }
}
