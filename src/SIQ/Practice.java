package SIQ;

public class Practice
{

//    11 12 13 14 15
    public static void printPattern(int n){

        for (int i=1;i<=n;i++){
            for (int j=1;i<=n;j++){
                if (i>=j){
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
        int n=5;
        printPattern(n);
    }
}
