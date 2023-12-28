package Arrays;

public class ShiftZeroToEdges
{
    public static void print(int res[]){
        for(int i=0;i<=res.length-1;i++){
            System.out.print(res[i] + " ");
        }
    }
    public static int[] shift(int nums[]){

        int res[]=new int[nums.length];
        int count=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==0){
                count++;
            }
        }

        int j=0;
        if(count%2==0){
            j=(count/2);
        }
        else {
            j=(count/2)+1;
        }

        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=0){
                res[j]=nums[i];
                j++;
            }
        }

        print(res);
        return res;
    }

    public static void main(String[] args) {
        int nums[]={};

        shift(nums);
    }
}
