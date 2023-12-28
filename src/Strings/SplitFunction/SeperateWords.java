package Strings.SplitFunction;

import java.util.Arrays;

public class SeperateWords
{
    public static void seperate(String str){
        String res[]=str.split(" ");
        System.out.println(Arrays.toString(res));

//        No. of words
        System.out.println(res.length);

//        print last word
        System.out.println(res[res.length-1]);

//        Length of ladst word
        System.out.println(res[res.length-1].length());
String str2="My name$$is*ne**eraj";
        String res1[]=str2.split("[ [$$]*]");
        System.out.println(Arrays.toString(res1));
    }

    public static void main(String[] args) {
        String str="My name is neeraj";
        seperate(str);
    }
}
