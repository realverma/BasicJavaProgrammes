package Strings;

import java.util.Scanner;

public class StringToIntegerNegative
{
    public static int convert(String str){
        int res=0;
        int i=0;
        if (str.charAt(0)=='-'){
            i=1;
        }
        for (;i<=str.length()-1;i++){
            res=res*10+(str.charAt(i)-48);
        }
        if (str.charAt(0)=='-'){
            return (-1)*res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(convert(str));
    }
}
