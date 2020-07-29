
import java.util.Scanner;

public class Exercise_052 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] n = new String[5];
        int[] e = new int[5];

        System.out.println("Ingresa los nombres y edades de las personas: ");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingresa el nombre %d:\n", i + 1);
            n[i] = sc.next();
            System.out.printf("Ingresa la edad de %s:\n", n[i]);
            e[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (e[i] > 18) {
                System.out.printf("%s, que tiene %d años.\n", n[i], e[i]);
            }
        }

        sc.close();
    }
}
