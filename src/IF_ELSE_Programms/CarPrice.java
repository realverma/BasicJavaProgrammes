package IF_ELSE_Programms;

public class CarPrice {
    public static void main(String[] args) {
        String name= "Verna", color="Black";
        int cc=1500, price=145000, insurance=0;
        float rtoTax=0, totalPrice=0;

        if(price< 50000){
            rtoTax=price*0.13f;
        }

        if (price>5000 && price<100000){
            rtoTax=price*0.15f;
        }

        if (price>100000 && price<2000000){
            rtoTax=price*0.18f;
        }

        if (price>200000){
            rtoTax=price*0.23f;
        }

        if(cc<800){
            insurance=2580;
        }

        if (cc>800 && cc <=1500){
            insurance=3850;
        }
        if (cc>1500 && cc <=2000){
            insurance=4450;
        }
        if (cc>2000 && cc <=3000){
            insurance=5800;
        }
        if(price>36000){
            insurance=6200;
        }
        totalPrice=price+insurance*5+rtoTax;
        System.out.println(totalPrice);

    }
}
