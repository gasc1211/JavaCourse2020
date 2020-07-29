
import java.util.Scanner;

public class Exercise_046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int[] v = new int[5];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    v[0]++;
                    break;
                case 'e':
                    v[1]++;
                    break;
                case 'i':
                    v[2]++;
                    break;
                case 'o':
                    v[3]++;
                    break;
                case 'u':
                    v[4]++;
                    break;
            }
        }

        System.out.printf(" a : %d %s \n", v[0], new String(new char[v[0]]).replace("\0", "*"));
        System.out.printf(" e : %d %s \n", v[1], new String(new char[v[1]]).replace("\0", "*"));
        System.out.printf(" i : %d %s \n", v[2], new String(new char[v[2]]).replace("\0", "*"));
        System.out.printf(" o : %d %s \n", v[3], new String(new char[v[3]]).replace("\0", "*"));
        System.out.printf(" u : %d %s \n", v[4], new String(new char[v[4]]).replace("\0", "*"));

        sc.close();
        
    }
}
