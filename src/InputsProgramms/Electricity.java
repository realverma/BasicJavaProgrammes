package InputsProgramms;

public class Electricity {
    public int bill;
    public int bill(int b){
        if(b>=101 && b<=200){
            int x=b%101+1;
            bill=x*5;
            return bill;
        }
        else if(b>=201){
            int y=b%201+1;
            bill=100*5+y*10;
            return bill;
        }
        else{
            return  bill;
        }
    }
    public static void main(String[] args) {
        Electricity e1=new Electricity();
        System.out.println(e1.bill(1000));
    }
}
