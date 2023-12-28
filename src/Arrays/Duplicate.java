package Arrays;

public class Duplicate
{

    public static void print(int nums[]){

        for (int i=0;i<= nums.length-1;i++){
            int c=1;
            for (int j=i+1;j<=nums.length-1;j++){
                if (nums[i]==nums[j]){
                    c++;
                    nums[j]=-1;
                }
            }

            if (c>1 && nums[i]!=-1){
                System.out.println(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        int nums[]={1,8,7,9,6,6,3,1,1,7};
        print(nums);
    }
}
