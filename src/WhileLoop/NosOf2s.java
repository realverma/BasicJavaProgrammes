package WhileLoop;

import java.util.Scanner;

public class NosOf2s {
    public  static int print(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            int j=i;
            while (j>0){
                int lastDigit=j%10;
                if (lastDigit==2){
                    count++;
                }
                j=j/10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(print(n));
    }
}
