class Student{
    String name;
    String id;
    int age;

    public void printInfo(){
        System.out.println("Student Name: " + (this.name));
        System.out.println("Student ID: " + this.id);
        System.out.println("Age: " + this.age);
    }
}

public class OOPs{
    public static void main(String args[]){
        Student s1 = new Student();

        s1.name = "Yasin";
        s1.id = "222-115-095";
        s1.age = 20;
        s1.printInfo();

        Student s2 = new Student();
        s2.name = "Mustafizur";
        s2.id = "222-115-090";
        s2.age = 22;
        s2.printInfo();
        
        Student s3 = new Student();
        s3.name = "Sabbir";
        s3.id = "222-115-100";
        s3.age = 22;
        s3.printInfo();
    }
}