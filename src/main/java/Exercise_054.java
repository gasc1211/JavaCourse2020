
import java.util.Scanner;

public class Exercise_054 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] n = new String[5];
        String cache;
        Float[] nn = new Float[5];
        Float cache2;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingresa el nombre y nota %d:\n", i + 1);
            n[i] = sc.next();
            nn[i] = sc.nextFloat();
        }

        for (int i = 0; i < 3; i++) {
            for (int e = i + 1; e < 3; e++) {
                if (n[i].compareTo(n[e]) > 0) {
                    cache = n[e];
                    cache2 = nn[e];
                    n[e] = n[i];
                    nn[e] = nn[i];
                    n[i] = cache;
                    nn[i] = cache2;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s obtuvo %.2f.\n", n[i], nn[i]);
        }


        sc.close();
    }
}
