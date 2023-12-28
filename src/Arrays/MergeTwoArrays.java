package Arrays;

import java.util.Arrays;

public class MergeTwoArrays
{
    public static int[] merge(int n1[], int n2[]){
        int res[]=new int[n1.length+ n2.length];
        int i=0;
        for (i=0;i<=n1.length-1;i++){
            res[i]=n1[i];
        }
        for (int j=0;j<= n2.length-1;j++){
            res[i]=n2[j];
            i++;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        int n1[]={1,2,3,0,8};
        int n2[]={4,5,6};

        merge(n1,n2);
    }
}
