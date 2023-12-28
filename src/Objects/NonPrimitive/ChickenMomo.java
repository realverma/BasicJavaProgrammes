package Objects.NonPrimitive;

public class ChickenMomo
{
    String name;
    int price;

    public ChickenMomo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " "+ price;
    }
}
