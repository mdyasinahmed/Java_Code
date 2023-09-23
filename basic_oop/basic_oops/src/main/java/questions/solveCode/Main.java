package questions.solveCode;

class A{
    private int x;
    private int y;

    A(){
        x = 3;
        y = 4;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getX()+a.getY());
    }
}
