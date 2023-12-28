package ConstructorsProgramms;

public class Beta extends Baap
{
    Beta(){
        this(7);
    }
    Beta(int x){
        System.out.println("Parameter Beta");
    }


    public static void main(String[] args) {
        Beta b1=new Beta();

    }
}
