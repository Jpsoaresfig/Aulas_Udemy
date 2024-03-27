import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        int ano;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        nome = sc.nextLine();
        System.out.println("Olá " + nome + ", como você está?");
        System.out.println("Agora, por favor, digite a sua idade:");
        idade = sc.nextInt();
        System.out.println("Ah, então você tem " + idade + " anos?");
    }
}
