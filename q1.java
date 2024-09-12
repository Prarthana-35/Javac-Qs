class Employee{
    private int id;
    private static int counter = 1000;
    public Employee(){
        id = ++counter;
    }
    public int getId() {
        return id;
    }
    public static int getCounter() {
        return counter;
    }
}
public class q1 {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        display(e1);
        display(e2);
        display(e3);
    }
    public static void display(Employee e) {
        System.out.println(e.getId() + " " + e.getCounter());
    }
}

/*
 *  1001 1003
 *  1002 1003
 *  1003 1003
 * since counter is static 
 */