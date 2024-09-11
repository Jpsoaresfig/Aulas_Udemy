import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n]; // criando uma matriz

        // Preenchendo a matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        // Exibir diagonal principal
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        // Contar valores negativos na matriz
        int contar = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[i].length; j++) { // Usando mat[i].length
                if (mat[i][j] < 0) { // Verifica se o valor é negativo
                    contar++;
                }
            }
        }

        System.out.println("Quantidade de valores negativos: " + contar);

        sc.close();
    }
}
