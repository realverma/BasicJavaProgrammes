package Arrays.Striver;

public class CountUniqueElements
{
    public static int countUniqueElements(int arr[]){
            int i=0;
        for (int j=1;j< arr.length;j++){
            if (arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,7};
        System.out.println(countUniqueElements(arr));
    }
}
