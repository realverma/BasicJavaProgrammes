package Strings;

public class Equals
{
    public static boolean equals(String str1, String str2){
        if (str1.length()!=str2.length()) return false;

        for (int i=0;i<=str1.length()-1;i++){
            if (str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="Neeraj";
        String str2="Neeraj";
        System.out.println(equals(str1,str2));
    }
}
