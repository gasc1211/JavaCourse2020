
import java.util.Scanner;

public class Exercise_041 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] n = new int[20];
        int my = 0;
        int mn = 999;
        int myi = 0;
        int mni = 0;

        System.out.println("Ingresa 20 enteros: ");
        for (int i = 0; i < 20; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (n[i] > my) {
                my = n[i];
                myi = i;
            }
            if (n[i] < mn) {
                mn = n[i];
                mni = i;
            }
        }

        System.out.printf("El mayor valor es: %d igual a %d.\n", myi, my);
        System.out.printf("El menor valor es: %d igual a %d.\n", mni, my);

        sc.close();
    }
}
