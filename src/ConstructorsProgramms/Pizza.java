package ConstructorsProgramms;

public class Pizza
{
    String type="Reguar";
    int price=150;
    boolean cheese;
    String topping1;
    String topping2;

    Pizza(boolean c){
        this.cheese=c;
        if(this.cheese==true){
            this.price=this.price+80;
        }
    }

    Pizza(boolean c, String t1){
        this.topping1=t1;
        this.cheese=c;
        this.price=this.price+40;
        if (this.cheese==true){
            this.price=this.price+80;
        }
    }

    Pizza(boolean c, String t1, String t2){
        this.cheese=c;
        this.topping1=t1;
        this.topping2=t2;
        this.price=this.price+75;
        if (cheese==true){
            this.price=this.price+80;
        }
    }

    void Bill(){
        System.out.println("Type : "+type);
        System.out.println("Topping 1 : "+topping1);
        System.out.println("Topping 2 : "+topping2);
        System.out.println("Cheese : "+cheese);
        System.out.println("Price : "+price);
        float gst=this.price*0.18f;
        float total=this.price+gst;
        System.out.println("GST : "+gst);
        System.out.println("Total : "+total);
    }

    public static void main(String[] args) {
        Pizza p1=new Pizza(true);
        Pizza p2=new Pizza(true, "Onion");
        Pizza p3=new Pizza(true, "Onion", "Paneer");
        p1.Bill();
        p2.Bill();
        p3.Bill();
    }
}
