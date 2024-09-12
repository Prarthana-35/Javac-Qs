class Validator {
    public int[] idStudent = { 101, 102, 103 };

    public void validateStudent(int id) {
        try{
            for(int i=0; i<=idStudent.length; i++){
                if(id == idStudent[i]) System.out.println("P");
            }
        }
        finally {
            System.out.println("Q");
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        Validator val = new Validator();
        try{
            val.validateStudent(101);
            System.out.println("R");           
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("S");
        }
        finally {
            System.out.println("T");
        }
    }
}
// P Q S T