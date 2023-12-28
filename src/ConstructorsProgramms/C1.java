package ConstructorsProgramms;

public class C1
{
    C1(){
        System.out.println("With out Params");
    }
    C1(int x){
        System.out.println(x);
    }
    C1(String s){
        System.out.println(s);
    }
    C1(int x, String s){
        System.out.println(x+" "+s);
    }
    C1(String s, int x){
        System.out.println(s + " "+ x);
    }

     void myMethod(){
        String myuser="Nanhe";
        System.out.println(myuser);
    }
    final void myMethod(int x){
        System.out.println(x);
    }
    void myMethod(String x){
        System.out.println(x);
    }
    void iamMenthod(){
        System.out.println("I am parent class method");
    }

    public static void main(String[] args) {
        C1 c1=new C1(21,"(Neraj");
        c1.myMethod();
//        c1.myMethod(5);
    }
}
