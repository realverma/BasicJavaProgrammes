package Objects;

public class Overloading {

    static int iamlegend=10;

    void myMethod1(byte a, byte b){
        System.out.println("I am byte");

    }
    void myMethod1(float a, float b){
        System.out.println("float");
    }

    void Overloading(){
        System.out.println("I am class Method");
        return;
    }
    Overloading(){
        System.out.println("I am Constructor");
        Overloading();
    }

    public static void main(String[] args) {
        Overloading o1=new Overloading();
        o1.myMethod1(12,13);
        o1.main("hdyd");
        System.out.println(iamlegend);

    }
    public static void main(String b) {
        System.out.println("Neeraj");

    }
}
