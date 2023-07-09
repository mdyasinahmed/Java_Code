import java.util.*;

// Java - Class
    class Pen{
        String color;
        String type;

        public void write(){
            System.out.println("Write Something.");
        }
    }

// Creating Object
public class OOPS{
    public static void main(String args[]){
        Pen pen1 = new Pen();

        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
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