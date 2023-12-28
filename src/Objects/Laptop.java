package Objects;

public class Laptop {
    String name, processor, brand;
    int price;
    public static void main(String[] args) {


        Laptop l1 = new Laptop();
        l1.brand="Dell";
        l1.name="Inspiration";
        l1. processor="i3";
        l1.price=78665;
        System.out.println(l1.name+ " " + l1.processor+ " " +l1.price);

        Laptop l2 = new Laptop();
        l1.brand="HP";
        l2.name="Pavallion";
        l2. processor="i7";
        l2.price=62990;
        System.out.println(l2.name+ " " + l2.processor+ " " +l2.price);

        Laptop l3 = new Laptop();
        l1.brand="Apple";
        l3.name="MacBook";
        l3. processor="i7";
        l3.price=110000;
        System.out.println(l3.name+ " " + l3.processor+ " " +l3.price);
    }
}
