package Objects;

public class Student
{
    String name, qualification;
    double percentage;
    int yearOFPassout;

    Student(String n,String q, double p, int yop){
        this.name=n;
        this.qualification=q;
        this.percentage=p;
        this.yearOFPassout=yop;
    }

    void details(){
        System.out.println(this.name+" "+ this.qualification+ " "+ this.percentage+" "+this.yearOFPassout);
    }

    public static void main(String[] args) {
        Student s1=new Student("Neeraj", "B.Tech", 66.6, 2022);
        Student s2=new Student("Abhishek", "B.Tech", 70, 2020);
        Student s3=new Student("Shubham", "BBA", 75.6, 2022);
        Student s4=new Student("Aditya", "B.Tech", 80, 2023);
        Student s5=new Student("Asha Negi", "Bsc", 86, 2021);
        Student s6=new Student("Neha Dahiya", "B.Pharma", 98, 2021);

        Student allStu[]={s1,s2,s3,s4,s5,s6};

//        for (int i=0;i<= allStu.length-1;i++){
//            allStu[i].details();
//        }

        System.out.println("Q1) All Student beloging to 2023 Passout");
        for (int i=0;i<= allStu.length-1;i++){
            if (allStu[i].yearOFPassout==2023){
                allStu[i].details();
            }
        }
        System.out.println();

        System.out.println(" Q2) Students who scored more than 60% and passed in 2023");
        for (int i=0;i<= allStu.length-1;i++){
            if (allStu[i].percentage>=60 && allStu[i].yearOFPassout==2023){
                allStu[i].details();
            }
        }

        System.out.println();
        System.out.println(" Q3) Students who scored more than 60% and passed in 2022");
        for (int i=0;i<= allStu.length-1;i++){
            if (allStu[i].percentage>=60 && allStu[i].yearOFPassout==2022){
                allStu[i].details();
            }
        }
        System.out.println();
        System.out.println(" Q4) Students who scored more than 80% and passed in 2022 or 2023");
        for (int i=0;i<= allStu.length-1;i++){
            if (allStu[i].percentage>=80 && allStu[i].yearOFPassout==2022 || allStu[i].yearOFPassout==2023){
                allStu[i].details();
            }
        }

    }
}
