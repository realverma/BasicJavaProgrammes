package IF_ELSE_Programms;

import java.util.Scanner;

public class LeapYearInRange
{
    public static boolean checkLeap(int n){
        if (n%400==0 || n%100!=0 && n%4==0){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        printLeap(1988,2025);
    }

    public static void printLeap(int a,int b){
        for (int i=a;i<=b;i++){
            if (checkLeap(i)){
                System.out.println(i+" ");
            }
        }
    }
}
