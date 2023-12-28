package Arrays.Striver;

public class SmallestArrElement
{
    public static int smallestArrElement(int arr[]){
        int samllest=arr[0];

        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]<samllest){
                samllest=arr[i];

                int s=Integer.MIN_VALUE;
            }
        }
        return samllest;
    }

    public static void main(String[] args) {

        int arr[]={5,8,6,7,2,22,7,8,-8};
        System.out.println(smallestArrElement(arr));
    }
}
