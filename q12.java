public class q12 {
    public static void main(String[] args) {
        int[] employeeSalary = { 1350, 2342, 6754, 1200, 1363 };
        int count = 0;
        for (int salary : employeeSalary) {
            switch (salary % 2) {
                default:
                    employeeSalary[count] = salary + 1;
                case 0:
                    employeeSalary[count] = salary + 1;
                    count++;
                case 1:
                    employeeSalary[count] = salary + 1;
                    break;
            }
        }
        for(int i=0; i<employeeSalary.length; i++){
            System.out.println(employeeSalary[i] + " ");
        }
    }
}
