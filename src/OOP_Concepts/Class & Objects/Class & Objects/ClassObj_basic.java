class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something.");
    }
}

public class ClassObj_basic{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
    }
}