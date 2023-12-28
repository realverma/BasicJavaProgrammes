package IF_ELSE_Programms;

import java.util.Scanner;

public class LeapYear
{
    public static boolean checkLeap(int n){
        if (n%400==0 || n%100!=0 && n%4==0){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkLeap(n));
    }
}
