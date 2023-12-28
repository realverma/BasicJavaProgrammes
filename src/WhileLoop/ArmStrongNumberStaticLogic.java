package WhileLoop;

public class ArmStrongNumberStaticLogic
{
    public static boolean print(int n){
        int temp=n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if (sum==temp){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(print(11));
    }
}
