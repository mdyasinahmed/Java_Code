package class_obj;

class Student{
    public String name;
    public int id;


    // Constructor
    Student(String StudentName, int StudentID){
        this.name = StudentName;
        this.id = StudentID;
    }

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }

}

class myRoom{
    public void openTheDoor(){
        System.out.println("Your Room is Open.");
        System.out.println("Get Your Laptop.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating Object for Student class
        Student student1 = new Student("Anu", 81); // object

        Student student2 = new Student("Yasin", 95);



        student1.printInfo();
        student2.printInfo();



















//        studentObject.name = "Anu";
//        studentObject.id = 81;
//        studentObject.printInfo();
//
//        studentObject.name = "Mahi";
//        studentObject.id = 95;
//        studentObject.printInfo();


//        myRoom Key = new myRoom();
//        Key.openTheDoor();

    }

}
