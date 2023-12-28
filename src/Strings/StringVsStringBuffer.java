package Strings;

public class StringVsStringBuffer
{
    void myMethod1(String name){
        System.out.println(name);
    }

    public StringVsStringBuffer(String name) {
    }

    public static void main(String[] args) {

        StringVsStringBuffer ss=new StringVsStringBuffer("Neeraj");
        StringVsStringBuffer ss2=new StringVsStringBuffer("Neeraj");
        System.out.println(ss==ss2);//false
        System.out.println(ss.equals(ss2));//false

    }
}
