package Arrays;

public class PalinArray
{
    public static boolean checkPalindrome(int n){

        int temp=n;
        int num=0;
        while(n>0){
            int rem=n%10;
            num=num*10+rem;
            n=n/10;
        }

        if(num==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static int PalinArray(int n[]){
        int count=0;

        for(int i=0;i<=n.length-1;i++){
            if(checkPalindrome(n[i])){
                count++;
            }
        }

        if(count==n.length){
            return 1;
        }
        else{
            return 0;
        }

    }

    public static void print(int n[]){
        for(int i=0;i<=n.length-1;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {  // O(nlogn)
        int A[]={111,222,333,444,121};
        System.out.println(PalinArray(A));
    }
}
