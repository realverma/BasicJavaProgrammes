package Strings;

import java.util.Arrays;

public class SortString
{
    public  static char[] fillArray(String str){
        char res[]=new char[str.length()];

        for (int i=0;i<=str.length()-1;i++){
            res[i]=str.charAt(i);
        }
        return res;
    }

    public static char[] sortString(String str){
        char res[]=fillArray(str);

        for (int i=0;i<=res.length-1;i++){
            boolean b=false;
            for (int j=0;j<res.length-1;j++){
                if (res[j]>res[j+1]){
                    b=true;
                    int temp=res[j];
                    res[j]=res[j+1];
                    res[j+1]= (char) temp;
                }
            }
            if (b==false){
                break;
            }
        }
        System.out.println(Arrays.toString(res));
        System.out.println(convertToString(res));
        return res;
    }

    public static String convertToString(char ch[]){
        String res=new String();
        for (int i=0;i<= ch.length-1;i++){
            res=res+ch[i];
        }

        return res;
    }

    public static void main(String[] args) {
        String str="Abhishek@123";
        fillArray(str);
        sortString(str);
    }
}
