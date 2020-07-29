
import java.util.Scanner;

public class Exercise_039 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float[] m = new float[4], t = new float[4];
        float tm = 0, tt = 0;

        System.out.println("Ingrese los sueldos del turno de la mañana: ");
        for (int i = 0; i < 4; i++) {
            m[i] = sc.nextFloat();
            tm += m[i];
        }

        System.out.println("Ingrese los sueldos del turno de la tarde: ");
        for (int i = 0; i < 4; i++) {
            t[i] = sc.nextFloat();
            tt += t[i];
        }

        System.out.printf("El gasto total en sueldos de la mañana es de: L. %.2f.\n", tm);
        System.out.printf("El gasto total en sueldos de la tarde es de: L. %.2f.\n", tt);

        sc.close();
    }
}
