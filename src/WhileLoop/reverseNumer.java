package WhileLoop;

public class reverseNumer
{
    public  static void print(int n){
        int res=0;
        while (n>0){
            int rem=n%10;
            res=res*10+rem;
            n=n/10;

        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        print(4589);
    }
}
