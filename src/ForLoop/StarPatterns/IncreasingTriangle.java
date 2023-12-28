package ForLoop.StarPatterns;

public class IncreasingTriangle
{
    public static void print(int n){

        //*
        //**
        //***
        //****
        //*****

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print2(int n){
        //1
        //12
        //123
        //1234
        //12345
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void print3(int n){
        //1
        //22
        //333
        //4444
        //55555
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void print4(int n){
        //1
        //23
        //456
        //78910
        //1112131415
        int extra=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(extra++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        print(n);
        print2(n);
        print3(n);
        print4(n);
    }
}
