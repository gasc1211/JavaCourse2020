
import java.util.Scanner;

public class Exercise_061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] n1 = new int[3][3];
        int[][] n2 = new int[3][3];
        int n;

        System.out.println("Ingresa el número:");
        n = sc.nextInt();

        System.out.println("Ingresa la matríz:");

        for (int i = 0; i < 3; i++) {
            for (int e = 0; e < 3; e++) {
                n1[i][e] = sc.nextInt();
                n2[i][e] = n1[i][e] * n;
            }
        }

        System.out.println("\nMatríz 1:");

        for (int i = 0; i < 3; i++) {
            for (int e = 0; e < 3; e++) {
                System.out.print(n1[i][e] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatríz 2:");

        for (int i = 0; i < 3; i++) {
            for (int e = 0; e < 3; e++) {
                System.out.print(n2[i][e] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
