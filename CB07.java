import java.util.Scanner;

public class CB07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();

        scanner.close();

        System.out.println(String.format("%.3f", r*2*3.14));
        System.out.println(String.format("%.3f", r*r*3.14));
    }
}