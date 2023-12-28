package SIQ;

public class pATTERN
{
    public static void main(String[] args) {
        int n=9;

//        pattern 1
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i+j==n+1 || i==j){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();
//        pattern 2

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i>=j){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();
//        pattern 2

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j>=i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();
//        pattern 2

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i+j>=n+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();
//        pattern 2
        int c=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i>=j){
                    System.out.print(c+" ");
                    c++;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
//        pattern 2
        char ch='A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i>=j){
                    System.out.print(ch+" ");
                    ch++;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();
//        pattern 2
int k=1; char bh='A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i>=j){
                    if (i%2==0){
                        System.out.print(k+" ");
                        k++;
                    }
                    else {
                        System.out.print(bh+" ");
                        bh++;
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
//        pattern 2

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i+j>=n+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
