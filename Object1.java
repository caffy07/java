// basic object based java program.

class Employee{
    int id;
    String name;
}
public class Object1 {
     public static void main(String[] args) {
        Employee human = new Employee();
        Employee human1 = new Employee();
        human.id = 23;
        human.name = "Nick";
        human1.id = 43;
        human1.name = "Noah";
       
        System.out.println(human.id);
        System.out.println(human.name);
        System.out.println(human1.id);
        System.out.println(human1.name);
      
    }
}
