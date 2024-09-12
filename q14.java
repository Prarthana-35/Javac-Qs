public class q14 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 2; i < 8; i += 2) {
            for (int j = 8; j > i; j -= 2) {
                if (i >= j / 2) {
                    continue;
                } else {
                    s += i + j;
                }
            }
        }
        System.out.println("Sum : " + s);
    }
}
//18