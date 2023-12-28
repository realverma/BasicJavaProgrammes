package Arrays.Striver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicate
{

    public static void removeDuplicate(int arr[]){
        HashSet<Integer> h1=new HashSet<Integer>();
        int count=0;
        for (int i=0;i<= arr.length-1;i++){
            count++;
            h1.add(arr[i]);

        }
        System.out.println("Count=" +(count-1));
        Object x[]=h1.toArray();
        for (Object j:x){
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,5,88,4,3,};
        removeDuplicate(arr);
    }

}
