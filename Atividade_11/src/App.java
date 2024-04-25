import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantas pessoas você quer a média de altura: ");
        int n = sc.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("digite a altura: ");
            vector[i] = sc.nextDouble();// usar o proprio for para acessar as posicoes do array
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vector[i];
        }
        double media = sum / n;
        System.out.printf("a media das alturas é: %.2f%n", media);

        sc.close();
    }
}
