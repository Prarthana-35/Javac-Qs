public class Calculator {
    private int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class q4 {
    public static void main(String[] args) {
        Calculator calci = new Calculator();
        System.out.println(calci.add(1,2));
    }
}

//compilation error as private methods cant be accessed outside the class in which they're declared