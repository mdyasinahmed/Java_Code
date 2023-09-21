package accessModifiers.privateA;

class S{
    private int data = 40;
    private void msg() {
        System.out.println("Hello Java!!");
    }
}
public class A {
    public static void main(String[] args){
        S obj = new S();
        //System.out.println(obj.data);
        //obj.msg
    }
}
