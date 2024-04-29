
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Quantos valores serão digitados? ");
        n = sc.nextInt();

        double vector[] = new double[n]; // observar onde declarar o array

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um valor ");
            vector[i] = sc.nextDouble();

        }
        // mostrar soma de todos os valores digitados
        double soma = funcoes.soma(n, vector);
        // mostrar media dos valores digitados
        double media = funcoes.media(n, vector);
        System.out.println("a soma dos valores digitados foi " + soma + " e a media " + media);
        // mostrar todos os valores digitados

        System.out.println("Os valores digitados foram: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        sc.close();

    }
}
