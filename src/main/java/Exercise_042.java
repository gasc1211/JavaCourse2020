
import java.util.Scanner;

public class Exercise_042 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char[] c = new char[20];

        System.out.println("Ingresa 20 caracteres: ");
        for (int i = 0; i < 20; i++) {
            c[i] = sc.nextLine().charAt(0);
        }

        System.out.println("Los valores ingresados y sus equivalentes ASCII son: ");

        for (int i = 0; i < 20; i++) {
            System.out.printf("%c = %d. \n", c[i], (int) c[i]);
        }

        sc.close();
    }
}
