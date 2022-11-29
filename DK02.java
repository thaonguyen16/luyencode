import java.util.Scanner;

public class DK02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        int max = a;
        if(b>max)
            max = b;
        if(c>max)
            max = c;
        
        System.out.println(max);
    }
}