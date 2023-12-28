package Strings;

public class RepeatNStrings
{
    public static String concat(String str, int n){
        String res="";
        for (int i=0;i<=str.length()-1;i++){
            res=res+add(str.charAt(i),n);
        }
        return  res;
    }

    public static String add(char ch, int n){
        String res="";
        for (int i=1;i<=n;i++){
            res=res+ch;
        }
        return res;
    }

    public static void main(String[] args) {
        String str="ABC";
        int n=3;
        System.out.println(concat(str,n));
    }
}
