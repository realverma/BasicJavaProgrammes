package Arrays;

public class SumOfEmentsinArray
{
    public static void printArray(int n[]){

        int sum=0;
        for (int i=0;i<=n.length-1;i++){
            sum+=n[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n[]={5,4,8,4,2,3};
        printArray(n);
    }
}
