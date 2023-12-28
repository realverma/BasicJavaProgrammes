package BasicProgramms;
import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int n){

        BigInteger fact=BigInteger.ONE;

        for (int i=1;i<=n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static void main(String[] args) {
        BigInteger b1=new BigInteger("100");
        System.out.println(factorial(100));
    }
}
