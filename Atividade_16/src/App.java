import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos alunos para ler a nota:");
        int n = sc.nextInt();

        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        String[] nome = new String[n];
        String[] resultado = new String[n]; 

        // Lê as notas e o nome de cada aluno
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do aluno:");
            nome[i] = sc.next();

            System.out.println("Digite a primeira nota:");
            nota1[i] = sc.nextDouble();

            System.out.println("Digite a segunda nota:");
            nota2[i] = sc.nextDouble();

            // Calcula a média final do aluno atual
            double mediaFinal = (nota1[i] + nota2[i]) / 2.0;

            // Verifica se o aluno foi aprovado ou reprovado
            if (mediaFinal >= 6.0) {
                resultado[i] = "Aluno " + nome[i] + " passou com média final: " + mediaFinal;
            } else {
                resultado[i] = "Aluno " + nome[i] + " reprovou com média final: " + mediaFinal;
            }
        }

        // Imprime os resultados fora do loop
        System.out.println("Resultados:");
        for (int i = 0; i < n; i++) {
            System.out.println(resultado[i]);
        }

        sc.close();
    }
}
