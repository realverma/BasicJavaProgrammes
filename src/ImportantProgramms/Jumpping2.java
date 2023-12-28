package ImportantProgramms;

import java.util.Scanner;

public class Jumpping2
{
    public static int countDigit(int n){
        int count=0;

        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static void JumppingNumber(int n){
        int noOfDigits=countDigit(n);
        int count=0;
        int digit2=0;
        while(n>0){
            int lastDigit=n%10;
            n=n/10;

            if(n!=0){
                digit2=n%10;
            }

           if (Math.abs(lastDigit-digit2)==0);
        }

        if(count==noOfDigits-1){
            System.out.println("Its Jumpping");
        }
        else System.out.println("Its not jumpping");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        JumppingNumber(n);
    }
}
