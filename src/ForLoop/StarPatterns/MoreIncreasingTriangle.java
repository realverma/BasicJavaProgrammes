package ForLoop.StarPatterns;

public class MoreIncreasingTriangle
{
    public static void print(int n){

        //1
        //AB
        //123
        //ABCD
        //12345

        for (int i=1;i<=n;i++){
            if (i%2==1){
                int extra=1;
                for (int j=1;j<=i;j++){

                    System.out.print(extra++);
                }
                System.out.println();
            }
            if (i%2==0){
                char extra='A';
                for (int j=1;j<=i;j++){

                    System.out.print(extra++);
                }
                System.out.println();
            }

        }
    }
    public static void print2(int n){

        //1
        //AB
        //234
        //ABCD
        //56789

        int extra2=1;
        for (int i=1;i<=n;i++){

            if (i%2==1){
                for (int j=1;j<=i;j++){

                    System.out.print(extra2++);
                }
                System.out.println();
            }
            if (i%2==0){
                char extra3='A';
                for (int j=1;j<=i;j++){

                    System.out.print(extra3++);
                }
                System.out.println();
            }

        }
    }

    public static void print3(int n){
        //1
        //2A
        //3B4
        //5C6D
        //7E8F9
        int extra=1;
        char extra2='A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (j%2==1){
                    System.out.print(extra++);
                }
                else {
                    System.out.print(extra2++);
                }

            }
            System.out.println();
        }

    }
    public static void print4(int n){
        System.out.println();
        //1
        //A 2
        //B 3 C
        //4 D 5 E
        int extra=1;
        char extra2='A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (j%2==0){
                    System.out.print(extra2++);
                }
                else {
                    System.out.print(extra++);
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n=5;
        print(n);
        print2(n);
        print3(n);
        print4(n);
    }
}
