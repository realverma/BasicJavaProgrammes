package Arrays;

public class ReverseAnArray
{
    public static int[] reverseArr(int[] nums){
        int[] res =new int[nums.length];
        int j=0;
        for (int i=nums.length-1;i>=0;i--){
            res[j]=nums[i];
            j++;
        }
        print(res);
        return res;
    }

    public  static  void print(int[] nums){
        for (int i=0;i<=nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] n ={5,4,8,4,2,3};
        reverseArr(n);
    }
}
