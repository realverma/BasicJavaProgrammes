package IF_ELSE_Programms;

import java.util.Scanner;

public class EvenOddWithoutMod
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if ((n & 1)==0){
            System.out.println("Even");
        }
        else System.out.println("Odd");
    }
}
