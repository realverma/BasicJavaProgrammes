package Arrays.Striver;

public class LargestArrayElement
{
    public static int largestArrElement(int arr[]){
        int largest=arr[0];
        for (int i=1;i<=arr.length-1;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        return  largest;
    }

    public static void main(String[] args) {

        int arr[]={5,8,6,7,2,22,0,0,-88,7,8};
        System.out.println(largestArrElement(arr));
    }
}
