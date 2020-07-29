
import java.util.Scanner;

public class Exercise_049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cc;

        System.out.println("Ingresa la frase a encriptar: ");
        String s = sc.nextLine().toUpperCase(), se = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '9') {
                cc = '0';
            } else if (s.charAt(i) == 'Z') {
                cc = 'A';
            } else {
                cc = (char) (((int) s.charAt(i)) + 1);
            }
            se += cc;

        }

        System.out.println(se);

        sc.close();
    }
}
