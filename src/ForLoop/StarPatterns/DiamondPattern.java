package ForLoop.StarPatterns;

public class DiamondPattern
{
    public static void print(int row, int col){
        for (int i=1;i<=row;i++){
            for (int j=col;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5,5);
    }
}
