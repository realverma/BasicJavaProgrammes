package Arrays;

public class EvenNumsinArray
{
    public static void printArray(int n[]){
        for (int i=0;i<=n.length-1;i++){
            if (n[i]%2==0){
                System.out.print(n[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n[]={5,4,8,4,2,3};
        printArray(n);
    }
}
