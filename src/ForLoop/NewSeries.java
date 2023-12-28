package ForLoop;

public class NewSeries
{
    public static void print(int n){

        // 2 15 41 80 .....
//        int x=2; int d=13;
//        for (int i=1;i<=n;i++){
//            System.out.print(x +" ");
//            x=x+d;
//            d=d+13;
//        }

        // 10 5 60 15 110.....
//        int x=10; int d=50;
//        for (int i=1;i<=n;i++){
//            System.out.print(x +" ");
//            x=x+d;
////            d=d+13;
        int x=10;int d=5;
        for (int i=1;i<=n;i++){
            System.out.println(x+" ");
            if (i%2==0){
                d=50;
                x=x+d;

            }
            else {

                x=x-d;

            }
        }
    }

    public static void main(String[] args) {
        print(10);
    }
}
