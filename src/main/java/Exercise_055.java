
import java.util.Scanner;

public class Exercise_055 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa las dimensiones de la matriz:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] n = new int[x][y];

        System.out.println("Ingresa los valores:");

        for (int i = 0; i < x; i++) {
            for (int e = 0; e < y; e++) {
                n[i][e] = sc.nextInt();
            }
        }

        for (int i = 0; i < x; i++) {
            for (int e = 0; e < y; e++) {
                System.out.println(n[i][e]);
            }
        }

        for (int e = 0; e < y; e++) {
            System.out.println(n[x - 1][e]);
        }

        sc.close();
    }
}
