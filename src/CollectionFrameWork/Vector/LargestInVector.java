package CollectionFrameWork.Vector;

import java.util.Vector;

public class LargestInVector
{
//    public static Vector<int> largest(){
//        Vector<int> v1=new Vector<int>();
//        v1.add(22);
//        v1.add(7);
//        v1.add(5);
//        v1.add(8);
//
//        return v1;
//    }

    public static void printVector(Vector v){

//        for (int i=0;i<=v.size()-1;i++){
//            System.out.println(v.get());
//        }

        for (Object o:v){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
//        printVector(largest());
    }
}
