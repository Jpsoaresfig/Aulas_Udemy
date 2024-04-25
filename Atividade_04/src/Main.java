import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite um número e quando for parar digite 00:");
            a = sc.nextInt();
            if (a != 00) {
                soma += a; // Adiciona a soma somente se a for diferente de 00
            }
        } while (a != 00); // saira do loop

        System.out.println("A soma dos valores digitados é de " + soma);
        sc.close();
    }
}
