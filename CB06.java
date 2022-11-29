import java.util.Scanner;

public class CB06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();

        scanner.close();

        System.out.println((length+width)*2);
        System.out.println((length*width));

    }
}