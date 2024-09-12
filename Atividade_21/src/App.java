import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Leitura do tamanho da matriz
        System.out.println("Digite dois números inteiros para definir o tamanho da matriz (linhas e colunas): ");
        int m = sc.nextInt(); // Número de linhas
        int n = sc.nextInt(); // Número de colunas
        int[][] mat = new int[m][n];

        // Preenchendo a matriz
        System.out.println("Digite os valores para preencher a matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Solicitar o valor que o usuário deseja buscar
        System.out.println("Qual o valor que você deseja saber onde está? ");
        int valor = sc.nextInt();

        // Buscando o valor na matriz e verificando os vizinhos
        boolean encontrado = false;
        for (int i = 0; i < m; i++) {//lnhas
            for (int j = 0; j < n; j++) {//colunas
                if (mat[i][j] == valor) {
                    encontrado = true;
                    System.out.println("Valor encontrado na posição [" + i + "][" + j + "]");

                    // Verificando o valor à esquerda
                    if (j > 0) {
                        System.out.println("Valor à esquerda: " + mat[i][j - 1]);
                    } else {
                        System.out.println("Não há valor à esquerda.");
                    }

                    // Verificando o valor à direita
                    if (j < n - 1) { // Isso verifica se j não está na última coluna
                        System.out.println("Valor à direita: " + mat[i][j + 1]);
                    } else {
                        System.out.println("Não há valor à direita.");
                    }

                    // Verificando o valor acima
                    if (i > 0) {//Se i > 0, pode acessar o valor acima (i - 1).
                        System.out.println("Valor acima: " + mat[i - 1][j]);
                    } else {
                        System.out.println("Não há valor acima.");
                    }

                    // Verificando o valor abaixo
                    if (i < m - 1) {
                        System.out.println("Valor abaixo: " + mat[i + 1][j]);
                    } else {
                        System.out.println("Não há valor abaixo.");
                    }
                }
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado na matriz.");
        }

        sc.close();
    }
}
