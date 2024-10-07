import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploFinally {
    public static void main(String[] args) {
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader("dados.txt"));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        } finally {
            // Este bloco vai ser executado independentemente do que acontecer no try ou catch
            if (leitor != null) {
                try {
                    leitor.close();
                    System.out.println("Arquivo fechado com sucesso.");
                } catch (IOException e) {
                    System.err.println("Erro ao fechar o arquivo: " + e.getMessage());
                }
            }
            System.out.println("Bloco finally executado.");
        }
    }
}
