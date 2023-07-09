import java.util.*;

// Java - Class
    class Pen{
        String color;
        String type;

        public void write(){
            System.out.println("Write Something.");
        }

        public void printColor(){
            System.out.println(this.color);
        }

        public void printType(){
            System.out.println(this.type);
        }
    }

    class Student{
        String name;
        int age;

        public void printInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
    }

// Creating Object
public class OOPS{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        
        pen1.printColor();
        pen2.printColor();



        
    }
}


// NOTES:
   // OOPS - Objects & Classes
        // Declaring a Class
        /**
         * Declaring class
         * class ClassName{
         * // fields - data
         * // methods - function
         * }
         * 
         * Declaring object
         * public static void main(String args[]){
         * }
         */