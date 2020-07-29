
import java.util.Scanner;

public class Exercise_044 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cinco nombres de compañeros: ");
        String cache;
        String[] s = new String[5];

        for (int i = 0; i < 5; i++) {
            s[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            for (int e = i + 1; e > 5; e++) {
                if (s[i].compareTo(s[e]) < 0) {
                    cache = s[i];
                    s[i] = s[e];
                    s[e] = cache;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s.\n", s[i]);
        }

        sc.close();
    }
}
