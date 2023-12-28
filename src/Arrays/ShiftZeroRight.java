package Arrays;

public class ShiftZeroRight
{
    public static void print(int nums[]){
        for(int i=0;i<=nums.length-1;i++){
            System.out.print(nums[i] +" ");
        }
    }

    public static int[] shirtzerorigth(int nums[]){

        int res[]=new int[nums.length];

        int j=0;
        for(int i=0;i<=nums.length-1;i++){
            if (nums[i]!=0){
                res[j]=nums[i];
                j++;
            }
        }
        print(res);
        return res;
    }
    public static void main (String[]args)
    {
        int n[]={8,9,1,0,8,0,1,0,6,4};
        shirtzerorigth(n);
    }
}
