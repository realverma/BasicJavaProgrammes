package Generalization;

public class Watch
{
    String model, color;
    int price;

    @Override
    public String toString() {
        return this.model+ " "+ this.color+" "+this.price;
    }
}
