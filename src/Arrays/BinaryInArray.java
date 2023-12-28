package Arrays;

import java.util.Arrays;

public class BinaryInArray
{
    public static int binarytodeci(int n){
        int i=0;
        int res=0;
        while(n>0){
            int lastbiit=n&1;
            res=lastbiit*(int)Math.pow(10,i)+res;
            n=n>>1;
            i++;
        }

        int temp=res;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }

        int nums[]=new int[count];
        int j=count-1;
        while(res>0){
            int rem=res%10;
            nums[j]=rem;
            res=res/10;
            j--;
        }
        System.out.println(Arrays.toString(nums));
        return res;
    }
    public static void main(String[] args) {
        // int nums[]={1000,500,200,100,50,20,10};
        System.out.println(binarytodeci(15));
    }
}
