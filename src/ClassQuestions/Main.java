package ClassQuestions;

public class Main
{
    public static void main(String[] args) {
        Employee e1=new Employee("Neeraj", "TCS",65);
        Employee e2=new Employee("Aditya", "Wipro",966660);
        Employee e3=new Employee("Abhishek", "Google", 855555);
        Employee e4=new Employee("Yaman","Adobe",14896545);
        Smartphone s1=new Smartphone("MM 1","Samsung", "Blue", 17222);
        Smartphone s2=new Smartphone("MM 2", "Samsung", "Black",12888);
        Smartphone s3=new Smartphone("Iphone 14", "Apple", "Gold", 499999);
        Smartphone s4=new Smartphone("Iphone 15","Apple", "Red",140000);

        Object x[]={e1,e2,e3,e4,s1,s2,s3,s4};
        for (int i=0;i<x.length;i++){
            if (x[i] instanceof  Employee && ((Employee) x[i]).salary>35000){
                ((Employee) x[i]).details();
            }
        }
        System.out.println();

        for (int i=0;i<x.length;i++){
            if (x[i] instanceof Smartphone){
                Smartphone s=(Smartphone) x[i];
                if (s.price>50000){
                    s.details();
                }

            }
        }
        System.out.println();
        for (int i=0;i<x.length;i++){
            if (x[i] instanceof Smartphone && ((Smartphone) x[i]).price>15000 && ((Smartphone) x[i]).price<30000){
                ((Smartphone) x[i]).details();
            }
        }

    }
}
