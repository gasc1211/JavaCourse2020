

import java.util.Random;
import java.util.Scanner;

public class Exercise_050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        System.out.println("Ingresa el número: ");
        int n = sc.nextInt();
        int[] nn = new int[30];

        for (int i = 0; i < 30; i++) {
            nn[i] = r.nextInt(10);
            if (nn[i] == n) {
                System.out.printf("Acertaste el valor de la posición %d.\n", i);
            }
        }


        sc.close();
    }
}
