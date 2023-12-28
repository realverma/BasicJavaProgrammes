package ForLoop;

public class NumberSeries {

    public static void print(int n){
        int x=1;
        for (int i=1;i<=n;i++){
            System.out.print(x*x+" ");
            x++;
        }
    }
    public static void main(String[] args) {
        print(10);
    }
}
