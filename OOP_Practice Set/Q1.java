class Employee { // Made the Employee class static
    int id;
    int salary;
    String name;

    void getSalary() {
        System.out.println("Salary: " + salary);
    }

    void getID() {
        System.out.println("ID: " + id);
    }

    void getName() {
        System.out.println("Name: " + name);
    }

    void setName(String name) {
        this.name = name;
    }
}

public class Q1 {

    public static void main(String[] args) {
        Employee Debanjan = new Employee(); // No need for Q1 instance now
        Debanjan.id = 1;
        Debanjan.name = "Debanjan";
        Debanjan.salary = 10000;
        Debanjan.getSalary();
        Debanjan.getID();
        Debanjan.getName();
        Debanjan.setName("Debanjan Dutta");
        Debanjan.getName();
    }
}