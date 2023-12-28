package WhileLoop;

public class PrintArmStrongNum
{
    public static void printArmStrong(int n){
        for (int i=1;i<=n;i++){
            boolean armstrong=CheckArmstrongNumDynamicLogic.checkArmStrongNum(i);
            if (armstrong){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        printArmStrong(407);
    }
}
