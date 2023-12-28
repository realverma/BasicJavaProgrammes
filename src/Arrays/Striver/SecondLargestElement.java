package Arrays.Striver;

public class SecondLargestElement
{
    public static int secondLargest(int arr[]){
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;

        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if (arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }

    public static void printSecondLargest(int[] arr){
        int slargest=secondLargest(arr);
        if (slargest==Integer.MIN_VALUE){
            System.out.println("There Must be atleast two elements");
        }
        else System.out.println(slargest);
    }

    public static void main(String[] args) {
        int arr[]={4,7,8,-8,-99};
        printSecondLargest(arr);
    }
}
