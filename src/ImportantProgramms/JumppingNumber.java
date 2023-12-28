package ImportantProgramms;

import java.util.Scanner;

public class JumppingNumber
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
        while(n>0){
            int lastDigit=n%10;
            System.out.println(lastDigit);
            int last2nd=n%100;
            System.out.println(last2nd);
            int last3rd=last2nd/10;
            System.out.println(last3rd);

            System.out.println(last3rd-lastDigit);

            if((last3rd-lastDigit)==1 || (last3rd-lastDigit)==-1){
                count++;
            }

            n=n/10;
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
