import java.util.Scanner;

public class DK06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        if(a == 0) {
            if(b==0){
                System.out.println("INF");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println(String.format("%.2f" , (double) -b/a));
        }
    
    }
}