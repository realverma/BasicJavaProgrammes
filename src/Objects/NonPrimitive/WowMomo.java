package Objects.NonPrimitive;

import java.util.Scanner;

public class WowMomo
{

    String name;
    int price;

    public WowMomo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    static VegMomo getVegMomo(){
        VegMomo v1=new VegMomo();
        return v1;
    }
    static ChickenMomo getChickenMomo(String name, int price){
        ChickenMomo c1=new ChickenMomo(name, price);
        return c1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int price=sc.nextInt();
        System.err.println(getVegMomo());
        System.out.println(getChickenMomo(name,price));
    }
}
