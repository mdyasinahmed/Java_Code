class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println("Student's Name: " + this.name);
        System.out.println("Student's Age: " + this.age);
    }
}

public class OOPS{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Yasin";
        s1.age = 20;

        s1.printInfo();
    }
}