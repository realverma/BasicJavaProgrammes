package Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort
{
    public  static  void print(int [] nums){
        for (int i=0;i<= nums.length-1;i++){
            for (int j=0;j<nums.length-2;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[]=new int [] {8,9,7,5,4,3,6,9,8};

        print(nums);
    }
}
