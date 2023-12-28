package Objects;

public class Employee
{
    String name,company;
    int service;
    double salary;

    public Employee(String name, String company, int service, double salary) {
        this.name = name;
        this.company = company;
        this.service = service;
        this.salary = salary;
    }

    void details(){
        System.out.println(name +" "+ company+" "+service+ " "+salary);
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Jacob", "Google", 8,8000000);
        Employee e2=new Employee("Mohit", "Microsoft", 3,50000);
        Employee e3=new Employee("Radha", "Wipro", 2,10000);
        Employee e4=new Employee("Sunny", "Accenture", 1,140000);
        Employee e5=new Employee("Monty", "HCL", 5,72000);
        Employee e6=new Employee("Sonia", "Logitech", 4,69400);

        Employee allEmps[]={e1,e2,e3,e4,e5,e6};

        System.out.println("Q1) Employees Whose serive is 2-5 years");
        for (int i=0;i<=allEmps.length-1;i++){
            if (allEmps[i].service>=2 && allEmps[i].service<=5){
                allEmps[i].details();
            }
        }

        System.out.println();
        System.out.println("Q2) Employees Who earns more than 75000");
        for (int i=0;i<=allEmps.length-1;i++){
            if (allEmps[i].salary>=75000){
                allEmps[i].details();
            }
        }

        System.out.println();
        System.out.println("Q2) Employees Who earns between 30k-70k");
        for (int i=0;i<=allEmps.length-1;i++){
            if (allEmps[i].salary>=30000 && allEmps[i].salary<=70000){
                allEmps[i].details();
            }
        }

        System.out.println();
    }
}
