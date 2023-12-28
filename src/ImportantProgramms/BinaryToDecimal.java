package ImportantProgramms;

public class BinaryToDecimal
{
    public static int convert(int n){
        int res=0;
        int i=0;
        while(n>0){
            int rem=n%10;
            res=res+pow(2,i)*rem;
            i++;
            n=n/10;
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
        System.out.println(convert(11001));
    }
}
