// create a class cylinder and use getter and setters to set its radius and height 
// calculate surface and volume of the cylinder 
class Cylinder{
    private double radius;
    private double height;
    public void setradius(double r){
        radius = r;
    }
    public void setheight(double h){
        height = h;
    }
    public double getradius(){
        return radius;
    }
    public double getheight(){
        return height;
    }
    public double Volume(){
      return 3.14*radius*radius*height;
    }
    public double SurfaceArea(){
       return 2*3.14*radius*(height+radius);
    }
}
public class GetSet2 {
    public static void main(String[] args) {
        Cylinder C = new Cylinder();
        C.setradius(33.4);
        C.setheight(22.34);
        System.out.println("The radius of cylinder is: " + C.getradius());
        System.out.println("The height of the cylinder is: " + C.getheight());
        System.out.println("Volume = " + C.Volume());
        System.out.println("Surface Area = " + C.SurfaceArea());
    }
}
