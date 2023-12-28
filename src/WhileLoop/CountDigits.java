package WhileLoop;

public class CountDigits
{
    public static int countDigits(int n){
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public  static int countDigitsWay2(int n){
        int countDigits= (int) (Math.log10(n)+1);
        return countDigits;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(456987));
        System.out.println(countDigitsWay2(456321));
    }
}
