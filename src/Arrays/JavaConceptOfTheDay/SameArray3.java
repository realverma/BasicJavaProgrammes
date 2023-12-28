package Arrays.JavaConceptOfTheDay;

public class SameArray3
{
    // CHECK IF TWO ARRAYS ARE SAME

    public static boolean checkSameArray(int a[], int b[]){

        if (a.length!=b.length) return  false;

        for (int i=0;i<=a.length-1;i++){
            if (a[i]!=b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int b[]={5,4,3,2,1};
        System.out.println(checkSameArray(a,b));
    }
}
