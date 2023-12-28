package Objects;

class Parent {
    public Parent() {
        System.out.println("Parent class constructor");
    }
    Parent(int x){
        System.out.println(x);
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        Parent p1=new Parent(4);

    }

}

public class Main {
    public Main() {
        System.out.println("main Const");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}

