public class q8 {
    public static void main(String[] args) {
        int n1 = 28, n2 = 36, n3 = 0;
        if (~(n2 / n1) < 0 && (n1 + n2) % 4 == 0) {
            n1 = n1 + --n3;
        }
        if ((n2 / n1) > 1 || n3 == 0) {
            n1 = n1 + n3++;
            System.out.println(n1 + --n3);
        }
        else {
            System.out.println(n1 + --n3);
        }
    }
}
//25