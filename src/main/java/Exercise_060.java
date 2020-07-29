
import java.util.Scanner;

public class Exercise_060 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] n = new int[4][4];

        System.out.println("Ingresa los enteros: ");

        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 4; e++) {
                n[i][e] = sc.nextInt();
            }
        }

        System.out.println("\n");

        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 4; e++) {
                System.out.print(n[i][e] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 4; e++) {
                System.out.print(n[e][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
