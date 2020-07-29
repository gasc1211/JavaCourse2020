
import java.util.Scanner;

public class Exercise_037 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa dos cadenas: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine(), s3 = "";
        
        int m = (int) Math.min(s1.length(), s2.length());
        
        for (int i = 0; i < m; i++){
            s3 += s1.charAt(i);
            s3 += s2.charAt(i);
        }
        
        if (s1.length() > m){
            s3 += s1.substring(m);
        } else{
            s3 += s2.substring(m);
        }
        
        System.out.printf("La cadena resultante es: %s", s3);
        sc.close();
        
    }
}
