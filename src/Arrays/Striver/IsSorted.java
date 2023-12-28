package Arrays.Striver;

public class IsSorted
{
    public static boolean isSorted(int arr[]){
        for (int i=1;i< arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        int arr2[]={-88,4,6,8};
        System.out.println(isSorted(arr));
        System.out.println(isSorted(arr2));
    }
}
