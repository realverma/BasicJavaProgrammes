package Objects;

public class TV {

    String name, type;
    int price;
    public static void main(String[] args) {


        TV t1 = new TV();

        t1.name="Sony";
        t1. type="LCD";
        t1.price=45000;
        System.out.println(t1.name+ " " + t1.type+ " " +t1.price);

        TV t2 = new TV();
        t2.name="Mi";
        t2. type="LED";
        t2.price=28765;
        System.out.println(t2.name+ " " + t2.type+ " " +t2.price);

        TV t3 = new TV();
        t3.name="Oneplus";
        t3. type="LED";
        t3.price=25664;
        System.out.println(t3.name+ " " + t3.type+ " " +t3.price);
    }
}
