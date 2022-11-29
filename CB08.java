import java.util.Scanner;

public class CB08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        scanner.close();

        System.out.println(a + " + " + b + " = " + (a+b));
    }
}