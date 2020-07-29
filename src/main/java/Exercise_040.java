
import java.util.Scanner;

public class Exercise_040 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] n = new int[15];
        int nn;

        System.out.println("Ingresa 15 números: ");

        for (int i = 0; i < 15; i++) {
            n[i] = sc.nextInt();
        }

        System.out.println("Ingresa el número de comparación: ");
        nn = sc.nextInt();

        for (int i = 0; i < 15; i++) {
            if (n[i] % 10 == nn) {
                System.out.println(n[i]);
            }
        }

        sc.close();
    }
}
