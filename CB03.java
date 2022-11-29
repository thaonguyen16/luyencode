import java.util.Scanner;

public class CB03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        int kq = a+b+c;
        System.out.println(kq);
    }
}