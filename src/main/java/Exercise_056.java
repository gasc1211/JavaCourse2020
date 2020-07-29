
import java.util.Scanner;

public class Exercise_056 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa las dimensiones de la matriz:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] n = new int[x][y];
        int my = 0;
        int myx = 0;
        int myy = 0;

        System.out.println("Ingresa los valores:");

        for (int i = 0; i < x; i++) {
            for (int e = 0; e < y; e++) {
                n[i][e] = sc.nextInt();
            }
        }

        for (int i = 0; i < x; i++) {
            for (int e = 0; e < y; e++) {
                if (n[i][e] > my) {
                    my = n[i][e];
                    myx = i;
                    myy = e;
                }
            }
        }

        System.out.printf("El mayor es: %d (%d, %d)", my, myx, myy);

        sc.close();
    }
}
