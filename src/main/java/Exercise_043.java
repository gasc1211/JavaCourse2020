
import java.util.Scanner;

public class Exercise_043 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String d;
        String[] n = new String[15];
        int cp = 0;

        for (int i = 0; i < 15; i++) {
            n[i] = sc.nextLine();
            d = new StringBuffer(n[i]).reverse().toString();
            if (n[i].equals(d)) {
                cp++;
            }
        }

        System.out.printf("La cantidad de capiicúas es de: %d.\n", cp);

        sc.close();
    }
}
