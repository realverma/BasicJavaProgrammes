package ConstructorsProgramms;

import java.io.IOException;

class Child extends Father
{
    Child(int x) throws IOException {
        this("Neeraj");
        System.out.println("Parametrised Child");
    }
    Child(String x) throws IOException {
        super();
        System.out.println(x+"I am String type Child Const");
    }
    Child() throws IOException {

        System.out.println("Child Class Constructor");
    }

    public static void main(String[] args) {
        try {
            Child c1=new Child(8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
