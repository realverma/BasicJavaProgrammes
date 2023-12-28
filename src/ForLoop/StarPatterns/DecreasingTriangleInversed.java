package ForLoop.StarPatterns;

public class DecreasingTriangleInversed
{
//    ****
//     ***
//      **
//       *

    public  static void print(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
