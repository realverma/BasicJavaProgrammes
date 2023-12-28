package WhileLoop;

public class CheckArmstrongNumDynamicLogic
{
    public static int countDigit(int n){
        int count=0;
        while (n>0){
            int rem=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
    public static boolean checkArmStrongNum(int n){
        int temp=n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum+(int )Math.pow(rem, countDigit(temp));
            n=n/10;
        }

        if (sum==temp){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(checkArmStrongNum(88593477));
    }
}
