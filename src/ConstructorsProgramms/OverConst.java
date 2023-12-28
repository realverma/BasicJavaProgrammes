package ConstructorsProgramms;

public class OverConst {
    OverConst(byte a, byte b){
        System.out.println("I am byte");

    }
    OverConst(float a, float b){
        System.out.println("float");
    }

    public static void main(String[] args) {
        OverConst o1=new OverConst((byte)1,(byte)2);

//        OverConst o1=new OverConst(1.0f,2.0f);
    }
}
