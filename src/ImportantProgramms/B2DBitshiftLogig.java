package ImportantProgramms;

public class B2DBitshiftLogig
{
    public static int printBinary(int n){
        int res=0;
        int i=0;
        while (n>0){
            int lastBit=n&1;
            res=lastBit*pow(10,i)+res;
            n=n>>1;
            i++;
        }
        return res;
    }

    public static int pow(int b,int p){
        int res=1;
        for (int i=1;i<=p;i++){
            res*=b;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(printBinary(15));
    }
}
