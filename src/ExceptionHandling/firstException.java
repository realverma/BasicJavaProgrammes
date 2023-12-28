package ExceptionHandling;

public class firstException
{
    public static void main(String[] args) {
        System.out.println("Start");
        int x=45;

        try {
            System.out.println(100/0);
        }
        catch (ArithmeticException e){
            x=458;
            System.out.println(x);
            System.exit(0);
        }
//        catch (ArithmeticException v){
//            System.out.println("ll");
//        }
//        finally {
//            System.out.println("I am finally");
//        }
//        System.out.println(x);
    }
}
