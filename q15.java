class Employee {
    public String name;
    public char gender;
    public double salary;

    public Employee(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Employee(String name) {
        this.name = name;
    }
}

public class q15 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 'M');
        Employee e2 = new Employee("Alex");
        System.out.println(e2.name + ',' + e2.gender + ',' + e1.name);
    }
}
