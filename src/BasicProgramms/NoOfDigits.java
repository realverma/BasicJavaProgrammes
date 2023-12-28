package BasicProgramms;

public class NoOfDigits
{
    public static void main(String[] args) {
        int n=852147;

        int noOfDigits=(int)Math.log10(n)+1;
        System.out.println(noOfDigits);
    }
}
