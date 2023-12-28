package Arrays;

public class DoubleStringCharacters
{
    public static String doubleStringChar(String str){
        String res="";

        for (int i=0;i<=str.length()-1;i++){
            res+=str.charAt(i)+str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String str="ABC";
        System.out.println(doubleStringChar(str));
    }
}
