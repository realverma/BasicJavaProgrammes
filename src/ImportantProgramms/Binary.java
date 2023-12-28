package ImportantProgramms;

import java.util.Scanner;

public class Binary
{
    public static long convert(int n){
        long res=0L;
        int temp=n;
        int i=0;
        while (n>0){
            int rem=n%2;
            res=rem*(long)Math.pow(10,i)+res;
            i++;
            n=n/2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal ");
        int n=sc.nextInt();
        System.out.println(convert(n));
    }
}
