package ForLoop.StarPatterns;

public class DecreasingTriangle
{
//        *****
//        ****
//        ***
//        **
//        *
    public static void print(int n){
         for (int i=5;i>=1;i--){
             for (int j=i;j>=1;j--){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
    public static void main(String[] args) {
        print(5);
    }
}
