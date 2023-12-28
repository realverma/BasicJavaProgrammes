package Arrays;

public class SameArray
{

    public static boolean checkSame(int a[], int b[]){

        if (a.length!=b.length) return  false;

        for (int i=0;i<=a.length-1;i++){
            if (a[i]!=b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int a[]={4,8,7,9};
        int b[]={4,8,7,9,1};
        System.out.println(checkSame(a,b));
    }
}
