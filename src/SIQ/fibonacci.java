package SIQ;

public class fibonacci
{
    public static void printfibonacci(int n){
        int n1=0;
        int n2=1;
        System.out.print(n1+ " "+n2+" ");

        for (int i=2;i<=n;i++){
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        printfibonacci(10);
    }
}
