package Objects.NonPrimitive;

public class Laptop
{
    String brand,color;
    int price;

    public Laptop(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    public String toString(){
        return this.brand+" "+this.color+" "+this.price;
    }

    public static void main(String[] args) {
        Laptop l1=new Laptop("Dell", "Silver", 65000);
        Laptop l2=new Laptop("Hp", "Black", 165000);
        Laptop l3=new Laptop("lenovo", "Gold", 85000);

        Laptop allLaptop[]={l1,l2,l3};
        for (int i=0;i<=allLaptop.length-1;i++){
            System.out.println(allLaptop[i]);
        }
    }
}
