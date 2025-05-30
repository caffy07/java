/*
Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)
 */
class Employe{
    int Salary;
    String name;

    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
    public void ChangeName(String n){
        name = n;
    } 
}
public class Employee {
    public static void main(String[] args) {
        Employe person1 = new Employe();
        Employe person2 = new Employe();
    person1.Salary = 3000;
    person1.name = "Noah";
    person2.Salary = 5000;
    person2.name = "Nick";

    System.out.println(person1.name);
    }
}

// more code to be edited