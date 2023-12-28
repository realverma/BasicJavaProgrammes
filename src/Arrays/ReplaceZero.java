package Arrays;

public class ReplaceZero
{
    public static int merge(int num,int d){
        if ((d<=0) || d>9){
            return -1;
        }

        int t=num;
        int res=0;
        int i=0;
        while (t>0){
            int rem=t%10;
            if (rem==0){
                res=d*(int) Math.pow(10,i)+res;
                i++;
            }
            else {
                res=rem*(int) Math.pow(10,i)+res;
                i++;
            }
            t=t/10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(merge(1001,9));
    }
}
