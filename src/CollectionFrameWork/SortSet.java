package CollectionFrameWork;

import java.util.HashSet;
import java.util.TreeSet;

public class SortSet
{
    public static void main(String[] args) {
        HashSet h1=new HashSet<>();

        h1.add(8);
        h1.add(22);
        h1.add(7);

        TreeSet t1=new TreeSet<>(h1);

        for (Object o:t1){
            System.out.println(o);
        }

        for (Object o:t1.descendingSet()){
            System.out.println(o);
        }


    }
}
