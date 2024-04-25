import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale us = Locale.US;
        System.out.println("digite a quantidade de produtos para cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consumindo a quebra de linha pendente

        String[] vectorProd = new String[n];
        double[] vectorPreco = new double[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("digite o nome do produto: ");
            vectorProd[i] = sc.nextLine();
            System.out.println("digite o valor do produto: ");
            vectorPreco[i] = sc.nextDouble();
            sum += vectorPreco[i];
            sc.nextLine();
        }

        double mediafinal = sum / n;

        System.out.println("produtos cadastrados: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vectorProd[i] + ", R$" + vectorPreco[i]);
        }
        System.out.println("a media dos valores dos produtos é: " + mediafinal);
        sc.close();
    }
    
}
