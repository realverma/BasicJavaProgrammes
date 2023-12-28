package Arrays;

public class EvenFrontOddBack
{
    public static int[] evenFOback(int nums[]){
        int res[]=new int[nums.length];
        int j=0;
        int m= res.length-1;
        for (int i=0;i<=nums.length-1;i++){
            if (nums[i]%2==0){
              res[j]=nums[i];
              j++;
            }

            if (nums[i]%2!=0){
                res[m]=nums[i];
                m--;
            }
        }
        print(res);
        return res;
    }

    public static void print(int nums[]){
        for (int i=0;i<=nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums ={4,8,9,6,4,7,2,0,1,4};

        evenFOback(nums);
    }
}
