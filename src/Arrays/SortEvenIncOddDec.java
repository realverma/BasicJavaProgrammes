package Arrays;

import java.util.Arrays;

public class SortEvenIncOddDec
{
    public  static  int[] print(int [] nums){
        for (int i=0;i<= nums.length-1;i++){
            for (int j=i+1;j<=nums.length-1;j++){
                if (nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    public static void shiftHackerRank(int num[]){
        int nums[]=print(num);
        int res[]=new int[nums.length];
        int j=0;
        int k=nums.length-1;
        System.out.println(Arrays.toString(nums));
        for (int i=0;i<= nums.length-1;i++){
                if (nums[i]%2==0){
                    res[j]=nums[i];
                    j++;
                }

                if (nums[i]%2!=0){
                    res[k]=nums[i];
                    k--;
                }
        }

        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int nums[]=new int [] {8,9,7,5,4,3,6,9,8};

        shiftHackerRank(nums);
    }
}
