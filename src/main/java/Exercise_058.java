
import java.util.Scanner;

public class Exercise_058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la dimension x de la matriz:");
        int y = sc.nextInt();
        int[][] n = new int[3][y];

        System.out.println("Ingresa los valores:");

        for (int i = 0; i < 2; i++) {
            for (int e = 0; e < y; e++) {
                n[i][e] = sc.nextInt();
            }
        }

        for (int i = 0; i < y; i++) {
            n[2][i] = n[0][i] + n[1][i];
        }

        for (int i = 0; i < 3; i++) {
            for (int e = 0; e < y; e++) {
                System.out.printf("%d ", n[i][e]);
            }
            System.out.println();
        }

        sc.close();
    }
}
