package Strings;

public class ToLowerCase
{
    public static String makeLowerCase(String str){
        String res="";
        for (int i=0;i<=str.length()-1;i++){
            if (str.charAt(i)>=65 && str.charAt(i)<=90){
                res=res+(char) (str.charAt(i)+32);
            }
            else res=res+str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String str="Abc@1234";
        System.out.println(makeLowerCase(str));
    }
}
