package Arrays;

import java.util.Arrays;

public class DoubleArrayCharacters
{
    public static int[] doubleArray(int nums[]){
        int res[]=new int[nums.length*2];
        int j=0;

        //1st
//        for (int i=0;i<= nums.length-1;i++){
//            res[j]=nums[i];
//            j++;
//            res[j]=nums[i];
//            j++;
//        }

        //2nd
        for (int i=0;i<= nums.length-1;i++){
            res[j]=nums[i];
            res[j+1]=nums[i];
            j=j+2;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int nums[]={89,5,1,2,3};
        doubleArray(nums);
    }
}
