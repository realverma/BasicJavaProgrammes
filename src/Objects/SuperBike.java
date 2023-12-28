package Objects;

public class SuperBike {
    String engine, topSpeed, model;
    int price;
    public static void main(String[] args) {


        SuperBike s1 = new SuperBike();
        s1.model="Kawasaki Z650";
        s1.engine="649 CC";
        s1. topSpeed="210 KMPH";
        s1.price=594000;
        System.out.println(s1.engine+ " " + s1.topSpeed+ " " +s1.price);

        SuperBike s2 = new SuperBike();
        s1.model="Street Triple R";
        s2.engine="765 CC";
        s2. topSpeed="225 KMPH";
        s2.price=884000;
        System.out.println(s2.engine+ " " + s2.topSpeed+ " " +s2.price);

        SuperBike s3 = new SuperBike();
        s1.model="Ducati Panigale V2";
        s3.engine="955 CC";
        s3. topSpeed="257 KMPH";
        s3.price=1700000;
        System.out.println(s3.engine+ " " + s3.topSpeed+ " " +s3.price);
    }
}
