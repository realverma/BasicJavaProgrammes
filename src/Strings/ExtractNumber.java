package Strings;

public class ExtractNumber
{
    public static int extractNumber(String str){
        int sum=0;

        for (int i=0;i<=str.length()-1;i++){
            if (str.charAt(i)>=48 && str.charAt(i)<=57){
                sum=sum+(str.charAt(i)-48);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(extractNumber("Neeraj@1234"));
    }
}
