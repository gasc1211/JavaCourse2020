
import java.util.Scanner;

public class Exercise_053 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] n = new String[5];
        Float[] p = new Float[5];
        Float[] d = new Float[5];
        Float[] i = new Float[5];
        Float[] t = new Float[5];

        for (int x = 0; x < 3; x++) {
            System.out.printf("Ingresa el nombre y precio del producto %d:\n", x + 1);
            n[x] = sc.next();
            p[x] = sc.nextFloat();
            d[x] = p[x] * .03f;
            i[x] = (p[x] - d[x]) * .15f;
            t[x] = p[x] - d[x] + i[x];
        }

        System.out.println("Producto\tPrecio\t\tDescuento\tImpuesto\tTotal");

        for (int x = 0; x < 3; x++) {
            System.out.printf("%s\t\tL. %.2f\tL. %.2f\t\tL. %.2f\tL.%.2f\n", n[x], p[x], d[x], i[x], t[x]);
        }

        sc.close();
    }
}
