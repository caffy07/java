// Overloaded the employee constructor to initialize the salary to Rs 10,000
class Employee{
 String name;
 int id;
 double salary;

public Employee(String n, int i){
    name = n;
    id = i;
    salary = 10000;
}
}
public class OverloadEmployee {
    public static void main(String[] args) {
    Employee p1 = new Employee("Gian", 27);
    System.out.println(p1.name + " " + p1.id + " " + p1.salary);
}
}