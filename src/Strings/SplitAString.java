package Strings;

public class SplitAString
{
    public static void main(String[] args) {
        String cars="Lamborghini, Ferrari, Ashton Martin, Hummer, McLarren";
        String allCars[]=cars.split(", ");
        for (String car:allCars) {
            System.out.println(car);
        }

    }
}
