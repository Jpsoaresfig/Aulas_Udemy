import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();
        String nome[] = new String[n];
        int idade[] = new int[n];
        double altura[] = new double[n];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("digite os dados da " + (i + 1) + " pessoa: ");
            System.out.println("digite a idade; ");
            idade[i] = sc.nextInt();
            System.out.println("digite a altura; ");
            altura[i] = sc.nextDouble();
            System.out.println("digite o nome; ");
            nome[i] = sc.next();

            if (idade[i] <= 16) {
                soma += 1;

            }
        }

        System.out.println("a media das alturas é: " + funcoes.media(n, altura));
        System.out.println("o total de pessoas com menos de 16 anos é: " + soma);

        System.out.println("As pessoas com menos de 16 anos são:");
        for (int i = 0; i < n; i++) {
            if (idade[i] <= 16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
