package Arrays;


import Objects.NonPrimitive.ChickenMomo;

public class Test
{
    int number=21;
}

class child extends Test{

    String name="Neeraj";
    void display(){
        System.out.println("I am child method");
    }


    public static void main(String[] args) {
        child c1=new child();
        int v=c1.number=8;
        System.out.println(v);
    }

}

class grandchild extends child{

    void display(){
        System.out.println("I am grandchild");
    }

    public static void main(String[] args) {
        grandchild g=new grandchild();
        g.display();
    }

}
