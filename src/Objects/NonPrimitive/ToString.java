package Objects.NonPrimitive;

public class ToString
{
    String name;int rollno;

    public ToString(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public static String toString(Object o) {
        return String.valueOf(o);
    }
    public static String toIdentityString(Object o) {
        return o.getClass().getName();
    }

    public static void main(String[] args) {
        ToString t1=new ToString("Neeraj",12412);
        System.out.println(toString(t1));
        System.out.println(t1);
        System.out.println(String.valueOf(t1));
        System.out.println(toIdentityString(t1));
    }
}
