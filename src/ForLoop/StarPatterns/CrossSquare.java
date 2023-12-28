package ForLoop.StarPatterns;

public class CrossSquare
{
    public static void print(int row, int col){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if (i==1 || j==1 || i==row || j==col || i==j || i+j==row+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(10,10);
    }
}
