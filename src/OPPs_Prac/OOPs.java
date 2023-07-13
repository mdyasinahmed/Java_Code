class Student{
    String name;
    String id;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.age);
    }
}

public class OOPs{
    public static void main(String args[]){
        Student s1 = new Student();

        s1.name = "Yasin";
        s1.id = "222-115-095";
        s1.age = 20;
        s1.printInfo();
    }
}