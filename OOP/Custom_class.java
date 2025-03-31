class Employee {

    int id;
    String name;
    double salary;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    int getid() {
        return id;
    }

    double getSalary() {
        return salary;
    }

}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom java class");
        Employee harry = new Employee();
        Employee Debanjan = new Employee();
        harry.id = 1;
        harry.name = "Harry";
        harry.salary = 500000;

        Debanjan.id = 2;
        Debanjan.name = "Debanjan";
        Debanjan.salary = 600000;

        // System.out.println(harry.id);
        // System.out.println(harry.name);
        // System.out.println(harry.salary);

        // OR

        harry.display();
        Debanjan.display();
        int harryid = harry.getid();
        double harrysalary = harry.getSalary();
        System.out.println(harryid);
        System.out.println(harrysalary);
    }
}