import java.util.Scanner;

public class DK04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
      
        scanner.close();

        System.out.println(Math.round(a));
    }
}