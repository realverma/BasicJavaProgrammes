package Strings;

public class Replace
{
    public static String replace(String str, int i, char ch ){
        if (i>=0 && i<=str.length()-1) {
            str = str.substring(0, i) + ch + str.substring(i + 1);
            return str;
        }
        else {
            return "Invalid Index";
        }
    }

    public static String replaceAll(String str, char ch){
        String res="";
        for (int i=0;i<=str.length()-1;i++){
            if (str.charAt(i)!=ch){
                res=res+str.charAt(i);
            }
            else {
                res=res+ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str="Hello";
        System.out.println(replace(str, 2,'T'));
        System.out.println(replaceAll(str, 'T'));
    }
}
