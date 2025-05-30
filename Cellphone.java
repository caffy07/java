// Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

class Cell{
    public void Ringing(){
        System.out.println("Ringing....");
    }
    public void Vibrating(){
        System.out.println("Vibrating...");
    }
    public void Pick(){
        System.out.println("Noah picked up the call");
    }
}
public class Cellphone {
    public static void main(String[] args){
        Cell cell = new Cell();
        cell.Ringing();
        cell.Vibrating();
        cell.Pick();
       
    }
}
