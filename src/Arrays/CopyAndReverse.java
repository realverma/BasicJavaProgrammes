package Arrays;

public class CopyAndReverse
{
    public static int[] copy(int n[]){

        int res[]=new int[n.length];
        for (int i=n.length-1;i>=0 ;i-- ){
            for (int j=0;j<=n.length-1;j++){
                res[j]=n[i];
            }
        }
        return res;
    }

    public static int [] reverse(int n[]){
        int res[]=new int [n.length];
        print(res);
        for (int i=n.length-1;i>=0;i--){
            res[i]=n[i];
        }
        return res;
    }

    public static void print(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n[]={1,1,2,5,8};
        reverse(n);
    }
}
