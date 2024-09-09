import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos quartos serão usados?");
        int n = sc.nextInt();

        String[] nome = new String[n];
        String[] email = new String[n];
        int[] quarto = new int[n];
        boolean[] quartoOcupado = new boolean[11]; // Array para rastrear quartos ocupados (índices 1 a 10)

        for (int i = 0; i < n; i++) {
            System.out.printf("Número do Aluguel %d:\n", i + 1);
            System.out.println("Nome: ");
            nome[i] = sc.next();
            System.out.println("Email: ");
            email[i] = sc.next();
            System.out.println("Quarto: ");
            int numeroQuarto = sc.nextInt();

            if (numeroQuarto < 1 || numeroQuarto > 10) {
                System.out.println("Número do quarto inválido. Digite um número de 1 a 10.");
                i--; // Reduz o índice para repetir a entrada do quarto inválido
                continue;
            }

            if (quartoOcupado[numeroQuarto]) {
                System.out.println("O quarto " + numeroQuarto + " está ocupado. Escolha outro quarto.");
                i--;
                continue;
            }

            quarto[i] = numeroQuarto;
            quartoOcupado[numeroQuarto] = true; // Marca o quarto como ocupado
        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < n; i++) {
            System.out.println(quarto[i] + ": para " + nome[i] + ", e-mail: " + email[i]);
        }

        sc.close();
    }
}
