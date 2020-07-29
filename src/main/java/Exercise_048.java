
import java.util.Scanner;

public class Exercise_048 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números: ");
        int n = sc.nextInt();
        int m = 0;
        int[] pn = new int[n];

        System.out.println("Ingresa los números: ");
        for (int i = 0; i < n; i++) {
            pn[i] = sc.nextInt();
            if (pn[i] > m) {
                m = pn[i];
            }
        }

        System.out.printf("El mayor es %d", m);

        sc.close();
    }

}
