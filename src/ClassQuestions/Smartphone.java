package ClassQuestions;

public class Smartphone
{
    String model,brand,color;
    int price;

    void details(){
        System.out.println(model+" "+brand+" "+color+" "+price);
    }
    public Smartphone(String model, String brand, String color, int price) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


}
