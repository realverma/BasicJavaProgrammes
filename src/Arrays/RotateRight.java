package Arrays;

public class RotateRight
{
    public static void print(int nums[]){
        for(int i=0;i<=nums.length-1;i++){
            System.out.print(nums[i] +" ");
        }
    }
    public static int[] rotateright(int nums[]){
        int temp=nums[nums.length-1];
        for (int i=nums.length-1;i>=0 ;i-- ){
            if ((i-1>=0)){
                nums[i]=nums[i-1];
            }
        }
        nums[0]=temp;
        print(nums);
        return nums;
    }
    public static void main(String[] args) {
        int n[]={8,9,1,6,4};
        rotateright(n);
    }
}
