package Strings;

public class Anagram
{

    public static boolean checkAnagram(String str1, String str2){
        if (str1.length()!=str2.length()) return false;

        String str3=toLowerCase(str1);
        String str4=toLowerCase(str2);
        char[] ch1 =toCharArray(str3);
        char[] ch2 =toCharArray(str4);
        sortArray(ch1);
        sortArray(ch2);

        for (int i=0;i<=ch1.length-1;i++){
            if (ch1[i]!=ch2[i]) return false;
        }
        return true;
    }

    public static String toLowerCase(String str){
        String res="";
        for (int i=0;i<=str.length()-1;i++) {
            if (str.charAt(i)>=65 && str.charAt(i)<=90){
                res=res+(char)(str.charAt(i)+32);
            }
            else {
                return res=res+str.charAt(i);
            }
        }
        return res;
    }

    public static char[] toCharArray(String str){
        char ch[]=new char[str.length()];

        for (int i=0;i<=ch.length-1;i++){
            ch[i]=str.charAt(i);
        }
        return ch;
    }

    public static char[] sortArray(char[] ch){


        for (int i=0;i<=ch.length-1;i++){
            for (int j=i+1;j<=ch.length-1;j++){
                if (ch[i]>ch[j]){
//                    ch[i]= (char) (ch[i]^ch[j]);
//                    ch[j]= (char) (ch[i]^ch[j]);
//                    ch[i]= (char) (ch[i]^ch[j]);
                    int temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=(char)temp;
                }
            }
        }
        return ch;
    }

    public static void main(String[] args) {

        String str1="Neeraj@123";
        String str2="neeraj@123";
        System.out.println(checkAnagram(str1, str2));
    }
}
