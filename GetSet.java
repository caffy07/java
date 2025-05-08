// Code on private access modifier

class Employee{
    private String name;
    private int id;

    public void setname(String n){
        name = n;
    }
    public void setid(int i){
        id = i;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}
public class GetSet {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setname("Noah");
        emp1.setid(200);
        System.out.println(emp1.getname() + " " + emp1.getid());
    }
}
