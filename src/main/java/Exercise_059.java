
import java.util.Scanner;

public class Exercise_059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] n = new int[7][7];

        for (int i = 0; i < 7; i++) {
            n[i][i] = 1;
        }

        for (int i = 0; i < 7; i++) {
            for (int e = 0; e < i; e++) {
                System.out.print("  ");
            }
            System.out.println(n[i][i]);
        }

        sc.close();
    }
}
