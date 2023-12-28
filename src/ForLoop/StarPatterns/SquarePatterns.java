package ForLoop.StarPatterns;

public class SquarePatterns
{
    public static void print(int n){
        //*
        //*
        //*
        //* * * *
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==4 || j==1)
                System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void print2(int n){
        //*
        //*
        //*
        //* * * *
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || j==4)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }



    public static void print3(int row, int col){

        System.out.println();
        //* * * *
        //      *
        //      *
        //      *
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if (i==1 || j==col)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void print4(int row, int col){

        System.out.println();
        //* * * *
        //*     *
        //*     *
        //* * * *
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if (i==1 || j==1 || i==row|| j==col)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void print5(int row, int col){

        System.out.println();
        //Right Diagonal
        //*
        //  *
        //    *
        //      *
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if (i==j)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void print6(int row, int col){

        System.out.println();
        //left Diagonal
        //      *
        //    *
        //  *
        //*
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if (i+j==row+1)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n=4;
        print(n);
        print2(n);
        print3(4,4);
        print4(4,4);
        print5(4,4);
        print6(4,4);
    }
}
