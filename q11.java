class Parent {
    public final void display() {
        System.out.println("Parent() method invoked");
    }
}

class Child extends Parent {
    public void display() {
       System.out.println("Child() method invoked");  
    }
}

public class q11 {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
    }
}

/*

Compilation Error !!

q11.java:8: error: display() in Child cannot override display() in Parent
    public void display() { 
                ^
  overridden method is final
1 error

Final method cannot be overridden

*/