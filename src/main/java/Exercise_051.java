
import java.util.Scanner;

public class Exercise_051 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 9 enteros ordenados: ");
        int[] n = new int[10];
        int nn;

        for (int i = 0; i < 9; i++) {
            n[i] = sc.nextInt();
        }

        System.out.println("Ingresa el último entero: ");
        n[9] = sc.nextInt();


        for (int i = 0; i < 10; i++) {
            for (int e = i + 1; e < 10; e++) {
                if (n[i] > n[e]) {
                    nn = n[i];
                    n[i] = n[e];
                    n[e] = nn;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(n[i]);
        }

        sc.close();
    }
}
