// Method overriding basic example

class A{
    public void method1(){
        System.out.println("This is 1st method of class A");
    }
}
class B extends A{
    @Override
    public void method1(){
        System.out.println("This is 1st method of class B");
    }
    public void method2() {
        System.out.println("This is 2nd method of class B");
    }
}
public class Override1 {
    public static void main(String[] args) {
        A hello = new A();
        hello.method1();
        B bello = new B();
        bello.method1();
        bello.method2();
    }
    
}
