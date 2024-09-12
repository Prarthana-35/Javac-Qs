class Student {
    public int id;
    public String name;
}

public class q6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s1;
    }
}
/*
 * 1.Instance variables : belong to an object (instance) of a class. here 2(id,name)
 * 2.Reference variables : store references (memory addresses) to objects created in memory. here 3(s1,s2,s3)
 * 3.Objects : created using new keyword. here 2 (s1,s2)
 */