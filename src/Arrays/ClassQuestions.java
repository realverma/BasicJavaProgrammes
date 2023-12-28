package Arrays;

public class ClassQuestions
{
    public static void main(String[] args) {


        int a[]={1,2,3,4,5,6,7,8,9,10,11,12};

        /// 1
        System.out.println("Ans 1");
        for (int i=1;i<=a.length-2 ;i++){
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("Ans 2");
        ///2
        for (int i=0;i<=((a.length/2)-1);i++){
            System.out.println(a[i]);
        }

        System.out.println();
        System.out.println("Ans 3");
        for (int i=2;i<a.length-2;i++){
            System.out.println(a[i]);
        }

        System.out.println();
        System.out.println("Ans 4");

        for (int i=a.length/2;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

        System.out.println();
        System.out.println("Ans 5");
        for (int i= a.length-3;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println();
        System.out.println("Ans 6");
        for (int i= a.length-1;i>=a.length-5;i--){
            System.out.println(a[i]);
        }

    }
}
