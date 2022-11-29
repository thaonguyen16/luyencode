import java.util.Scanner;

public class DK03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
      
        scanner.close();

        int result = a;

        if(a < 0) {
            if(b < 0){
                result = Math.abs(a-b);
            }
            else{
                result = Math.abs(a) + b;
            }
        }
        else {
            if(b < 0) {
                result = Math.abs(b) + a;
            }
            else{
                result = Math.abs(a-b);
            }
        }

        System.out.println(result);

    }
}