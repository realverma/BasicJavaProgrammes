package Arrays;

import java.security.PublicKey;

public class printDuplicates
{

    public static void print(int nums[]){
        for (int i=0;i<=nums.length-1;i++){
            for (int j=i+1;j<= nums.length-1;j++){
                System.out.println(nums[i]+ "--->"+ nums[j]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,7,7};
        print(arr);
    }
}
