package ClassQuestions;

public class Employee
{
    String name, company;
    int salary;

    public Employee(String name, String company, int salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }
    void details(){
        System.out.println(name+" "+company+" "+salary);
    }

    public static void main(String[] args) {


    }
}
