
import java.util.Random;
import java.util.Scanner;

public class Exercise_047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de números que contendrá el array:");

        int n = sc.nextInt();
        int t = 0;
        int[] nn = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            nn[i] = r.nextInt(9);
            t += nn[i];
            System.out.printf("%d : %d\n", nn[i]);
        }

        System.out.printf("El total es de: %d\n", t);

        sc.close();
    }
}
