package Strings;

public class StringMultiplication
{
    public static int multiplyString(String a, String b){
        int res=0;
        int num1=StringToIntegerNegative.convert(a);
        int num2=StringToIntegerNegative.convert(b);
        return res=num1*num2;
    }
    public static void main(String[] args) {
        System.out.println(multiplyString("-10","20"));

    }
}
