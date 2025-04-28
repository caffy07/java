// Create a class and Derive another class from it.
class Animal{
  private int x;
public void setX(int x){
  System.out.println("I am setting value of x");
   this.x = x;
}
  public int getX(){
    return x;
  }
}

class Elephant extends Animal{
  private int y;
  public void setY(int y){
    System.out.println("I am setting value of y");
    this.y = y;
  }
  public int getY(){
    return y;
  }
}

public class Inheritance1{
  public static void main(String[] args){
    Animal cat = new Animal();
    cat.setX(223);
    System.out.println("The number of first animal is: " + cat.getX());

    Elephant cute = new Elephant();
  cute.setY(999);   // you can use setX and getX in derived class also
  System.out.println("The number of second animal is: " + cute.getY());
}
}
