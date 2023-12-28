package WhileLoop;

public class ShiftNumRight
{
    public static int shiftRight(int n){
        int noOfDigits=(int)Math.log10(n)+1;

        int n1=n%10;
        int n2=n/10;
        return n1*(int)Math.pow(10,noOfDigits-1)+n2;
    }

    public static void main(String[] args) {
        System.out.println(shiftRight(4568));

    }
}
