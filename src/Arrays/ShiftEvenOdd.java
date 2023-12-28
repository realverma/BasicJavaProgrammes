package Arrays;

public class ShiftEvenOdd
{

    // SHIFTING EVEN TO RIGHT AND ODD TO LEFT
    public static void print(int res[]){
        for(int i=0;i<=res.length-1;i++){
            System.out.print(res[i] + " ");
        }
    }
    public static int[] shift(int nums[]){

        int res[]=new int[nums.length];
        int j=res.length-1;
        int m=0;
        for(int i=0;i<=nums.length-1;i++){
            if (nums[i]%2==0){
                res[j]=nums[i];
                j--;
            }

            if(nums[i]%2!=0){
                res[m]=nums[i];
                m++;
            }
        }

        print(res);
        return res;
    }
    public static void main(String[] args) {
        int nums[]={5,0,8,7,0,9,4,3};

        shift(nums);
    }
}
