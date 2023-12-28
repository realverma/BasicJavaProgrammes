package Arrays;

public class CopyAnArray
{
    public static int[] copy(int n[]){

        int res[]=new int[n.length];
        print(n);
        print(res);
        for (int i=0;i<=n.length-1 ;i++ ){
            res[i]=n[i];
        }
        print(res);
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
        copy(n);
    }
}
