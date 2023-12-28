package Arrays;

import java.util.Scanner;



public class AverageMarks
{
    static String test(){
        int ss=20;
        return "Hello I am Test";
    }
    String test2(){
        int ss=20;
        return "Hello I am Test 2";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of Students");
        int n=sc.nextInt();
        System.out.println("Enter marks");
        int marks[]=new int[n];
        int avgM=0;
        for (int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            avgM+=marks[i];
        }
        avgM/=n;
        System.out.println(avgM);

//        int avgMarks=0;
//        for (int i=0;i<n;i++){
//            avgMarks+=marks[i];
//        }
//        avgMarks/=n;
//        System.out.println(avgMarks);

    }
}
