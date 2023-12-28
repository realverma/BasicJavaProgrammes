package Arrays;

public class CurrencyGoals
{
    //logic 1
    public static int goal(int n, int nums[]){
        int sum=0;
        int i=0;
        while (n>0) {
                sum += n / nums[i];
                n = n % nums[i];
                i++;
            }
        return sum;
    }
    //Logic 2
    public static int goal2(int amount, int nums[]){
        int total=0;
        for (int i=0;i<=nums.length-1;i++){
            total+=amount/nums[i];
            if (amount%nums[i]==0){
                break;
            }
            amount=amount%nums[i];
        }
        return total;
    }



    public static void main(String[] args) {
        int nums[]={9,6,5,1};
       int sum= goal(11, nums);

        System.out.println(sum);

        System.out.println(goal2(11,nums));
    }
}
