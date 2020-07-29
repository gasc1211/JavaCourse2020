
import java.util.Scanner;

public class Exercise_038 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        float av = 0f;
        double[] hs = new double[5];
        
        
        System.out.println("Ingresa cinco números: ");
        for(int i = 0; i < 5; i++){
            hs[i] = sc.nextDouble();
            av += hs[i];
        }
        
        av /= 5;
        
        int my = 0, mn = 0;
        
        for(int i = 0; i < 5; i++){
            if(hs[i] > av){
                my++;
            } else{
                mn++;
            }
        }
        
        System.out.printf("El promedio es de: %.2f.\n", av);
        System.out.printf("La cantidad de mayores al promedio es de: %.2f.\n", my);
        System.out.printf("La cantidad de menores al promedio es de: %.2f.\n", mn);

        sc.close();
    }
}
