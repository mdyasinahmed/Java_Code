// NOTES:
// Declare
/**
 * Class Test{
 *      Test(){
 *      // body
 *      }
 * }
 */

class Main{
    private String name;
    //Constructor
    Main(){
        System.out.println("Constructor Called.");
        name = "fun coder";
    }
}

public static void main(String args[]){
        // constructor is invoked while creating object in main class
        Main obj = new Main();
        System.out.println("The name is" + obj.name);
}