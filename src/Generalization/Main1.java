package Generalization;

public class Main1
{
    public static void main(String[] args) {
        Fossil f1=new Fossil("FF123", "Black", 59999);
        Fossil f2=new Fossil("FF-rr", "Gold", 78549);
        Sonata s1=new Sonata("SS1-1", "White", 47851);
        Sonata s2=new Sonata("SS773", "Rose Gold", 7852146);

        Watch x[]={f1,f2,s1,s2};

        for (Watch w:x){
            System.out.println(x);
        }
    }
}
