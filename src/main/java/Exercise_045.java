
import java.util.Scanner;

public class Exercise_045 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String s = sc.nextLine();
        String[] ss = s.split(" ");

        for (int i = 0; i < ss.length; i++) {
            for (int e = 0; e < ss[i].length(); e++) {
                System.out.println(ss[i].charAt(e));
            }
            System.out.println(ss[i].length() + "\n");
        }

        sc.close();
    }
}
