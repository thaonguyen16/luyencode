import java.util.Scanner;

public class CB04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

        if(b == 0)
            System.out.println("INF");
        else
            System.out.println(String.format("%.2f", (double) a/b));

    }
}