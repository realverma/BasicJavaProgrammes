package ConstructorsProgramms;

public class C2 extends C1
{
//    C2(){
//
//        System.out.println("I am C2 Const");
//
//    }
    C2(int x){
        super(x);
        System.out.println("I am C2 Const with int x");
    }
    void myMethod(String x){
        System.out.println("3");
    }
     @Override
     void myMethod(){
        String myuser="nee";
        System.out.println(myuser);
    }
    void methodChild(){
        System.out.println("I am child class method");
    }

//     void myMethod(int x){
//        System.out.println("4");
//    }
    public static void main(String[] args) {
        C2 c2=new C2(585);
//        c2.myMethod();

    }
}
