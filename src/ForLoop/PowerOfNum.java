package ForLoop;

public class PowerOfNum
{
    public static int power(int b,int p){
        int res=1;
        for (int i=1;i<=p;i++) {
            res *= b;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(2,4));
//        long powerofnum=(long) power(2,3);
//        System.out.println(powerofnum);
        System.out.println(Math.pow(2.4,85));
    }
}
