// Create class grandfather, father and son.

class Grandfather{
    Grandfather(){
        System.out.println("I am the grandfather");
    }
    Grandfather(int x){
        System.out.println("I am Grandfather and my age is: " + x);
    }
}
class Father extends Grandfather{
    Father(){
        System.out.println("I am the father");
    }
    Father(int x, int y){
        super(x);
        System.out.println("I am the father my age is: " + y);
    }
}
class Son extends Father{
    Son(){
        System.out.println("I am the son");
    }
    Son(int x, int y, int z ){
        System.out.println("I am the son and my age is: " + z);
    }
}
public class Inheritance2{
    public static void main(String[] args) {
        Son A = new Son(60,30,4);
    }
}