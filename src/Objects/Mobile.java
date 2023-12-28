package Objects;

public class Mobile {
    String name, ram, brand;
    int price;
    public static void main(String[] args) {


        Mobile m1 = new Mobile();
        m1.brand="RealMe";
        m1.name="8 Pro";
        m1. ram="8GB";
        m1.price=19990;
        System.out.println(m1.name+ " " + m1.ram+ " " +m1.price);

        Mobile m2 = new Mobile();
        m1.brand="RedMe";
        m2.name="9 Pro";
        m2. ram="8 GB";
        m2.price=19490;
        System.out.println(m2.name+ " " + m2.ram+ " " +m2.price);

        Mobile m3 = new Mobile();
        m1.brand="Apple";
        m3.name="iPhone13";
        m3. ram="6 GB";
        m3.price=119000;
        System.out.println(m3.name+ " " + m3.ram+ " " +m3.price);
    }
}
