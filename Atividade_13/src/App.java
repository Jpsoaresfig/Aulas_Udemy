
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Quantos numeros serão digitados?");
        int n = sc.nextInt();

        int[] vector = new int[n];
        int[] x = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("digite um numero positivo ou negativo:");
            vector[i] = sc.nextInt();

            if (vector[i] < 0) {
                x[i] = vector[i];
            }

        }
        System.out.println("Os valores negativos digitados foram: ");
        for (int i = 0; i < n; i++) {
            if (x[i] < 0) {
                System.out.println(x[i]);
            }
            
        }
        sc.close();
    }
}
