package Arrays.Striver;

public class SecondSmallest
{
    public static int secondSmallest(int arr[]){
        int smallest=arr[0];
        int secsmallest=Integer.MAX_VALUE;

        for (int i=0;i< arr.length;i++){
            if (arr[i]<smallest){
                secsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && arr[i]<secsmallest){
                secsmallest=arr[i];
            }
        }
        return secsmallest;
    }

    public static void printSecondSmallest(int arr[]){
        int secSmallest=secondSmallest(arr);

        if (secSmallest==Integer.MAX_VALUE){
            System.out.println("There Must be atleast one element in the array");
        }
        else System.out.println(secSmallest);
    }

    public static void main(String[] args) {
        int arr[]={8,2147483647,-8,-9,57};
        printSecondSmallest(arr);
    }
}
