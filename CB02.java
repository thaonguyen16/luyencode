import java.util.Scanner;

public class CB02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        int c = a+b;
        System.out.println(c);
    }
}