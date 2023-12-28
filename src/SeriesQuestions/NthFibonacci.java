package SeriesQuestions;

import java.util.Scanner;

public class NthFibonacci {

    //LOGIC 1
//    public static void print(int n){
//        int n1=0;
//        int n2=1;
//        int n3=0;
//        for (int i=1;i<=n-2;i++){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//        }
//        if (n>2){
//            System.out.print(n3);
//        } else if (n==1) {
//            System.out.print(0);
//        }
//        else System.out.print(1);
//    }

    //LOGIC 2
    public  static int print(int n){
        int n1=0;
        int n2=1;
        int n3=0;
        for (int i=1;i<=n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n3-n1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(print(n));
    }

}
