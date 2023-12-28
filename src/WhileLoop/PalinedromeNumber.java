package WhileLoop;

public class PalinedromeNumber {
    public  static void print(int n){
        int temp=n;
        int res=0;
        while (n>0){
            int rem=n%10;
            res=res*10+rem;
            n=n/10;

        }
        if (res==temp){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palinedrome");
    }

    public static void main(String[] args) {
        print(121);
    }
}
