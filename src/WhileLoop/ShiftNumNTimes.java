package WhileLoop;

public class ShiftNumNTimes
{
    public static int shiftRight(int n, int rotation){
        for (int i=1;i<=rotation;i++) {
            int noOfDigits = (int) Math.log10(n) + 1;

            int n1 = n % 10;
            int n2 = n / 10;
            n= n1 * (int) Math.pow(10, noOfDigits - 1) + n2;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(shiftRight(4568,1));

    }
}
