package WhileLoop;

import java.util.Scanner;

public class MergeTwoNum
{
    public static long merge(int n1,int n2){
        int temp=n2;
        int c=0;
        long r=0l;
        while(temp>0){
            c++;
            temp=temp/10;
        }
        r=n1*(long)pow(10,c)+n2;
        return r;
    }
    public static long pow(int b,int p){
        long rem=1l;
        for (int i=1;i<=p;i++){
            rem=rem*b;
        }
        return rem;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two no ");
        if (sc.hasNextInt()){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println(merge(num1,num2));
        }
        else{
            System.out.println("Invalid Input ");
        }
    }
}
