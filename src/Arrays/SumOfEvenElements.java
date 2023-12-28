package Arrays;

public class SumOfEvenElements
{
    public static void printArray(int n[]){
        int sum=0;
        for (int i=0;i<=n.length-1;i++){
            if (n[i]%2==0){
                System.out.print(n[i]+" ");
                sum+=n[i];
            }
        }
        System.out.println();
        System.out.print(sum+" ");
    }

    public static void main(String[] args) {
        int n[]={5,4,8,4,2,3};
        printArray(n);
    }

    public static class AllCircularPrimeInArr
    {
        public static boolean checkAllCircularPrimeInArr(int n[]){
            int count=0;
            for (int i=0;i<=n.length-1;i++){
                if (CircularPrimeInArr.checkCircularprime(n[i])){
                    count++;
                }
            }
            if (count==n.length){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            int n[]={5,197,131,7,31,13};
            System.out.print(checkAllCircularPrimeInArr(n)+" ");
        }
    }
}
