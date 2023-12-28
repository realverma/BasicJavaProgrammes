package Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort
{
    public  static  void print(int [] nums){
        for (int i=0;i<= nums.length-1;i++){
            for (int j=i+1;j<=nums.length-1;j++){
                if (nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
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
