package accessModifiers.defaultM;

class A{
    void msg() {
        System.out.println("Hello");
    }
}
public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg(); // call function
    }
}
