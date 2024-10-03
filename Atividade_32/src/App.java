import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Atividade_32.Entities.ImportedProduct;
import Atividade_32.Entities.UsedProduct;
import Atividade_32.Entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Product> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Quantidade de produtos : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Produto de numero " + i + " Informações: ");
            System.out.println("Comum, usado ou importado (c/u/i)");
            String op = sc.next();
            System.out.println("Nome do produto: ");
            String nome = sc.next();
            System.out.println("Preço do produto: ");
            double preco = sc.nextDouble();
            if (op.equals("i")) {
                System.out.println("valor de importação: ");
                double importe = sc.nextDouble();
                lista.add(new ImportedProduct(nome,  preco, importe));

            } else if (op.equals("u")) {
                System.out.println("Data de fabricação: ");
                Date data = sdf.parse(sc.next());
                lista.add(new UsedProduct(nome, preco, data));
            } else {
                lista.add(new Product(nome, preco));
            }

        }

        System.out.println("Preços dos produtos ");
        for (Product p : lista) {
            System.out.println(p.toString());
        }
        sc.close();
    }

}
