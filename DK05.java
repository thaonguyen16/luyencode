import java.util.Scanner;

public class DK05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();

        scanner.close();

        int count = 0;

        if (a >= 0) {
            for (long i = 0; i <= Math.sqrt(a); i++) {
                if (i * i == a) {
                    count++;
                    break;
                }
            }

        }
        if (count == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}