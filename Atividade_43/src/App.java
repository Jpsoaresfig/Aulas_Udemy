import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Atividade_43.Entities_43.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.println("Enter File path: ");
        String filePath = scanner.nextLine();

        File sourcFile = new File(filePath);// criar objeto que passa o caminho
        String filefolder = sourcFile.getParent();// pegando parametros

        boolean sucess = new File(filefolder + "/out").mkdirs(); // mkdir serve para criar pastas, mkdirs serve para
                                                                 // criar pastas e subpastas

        String targetFilestr = filefolder + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {// lendo itens do arquivo

            String line = br.readLine();
            while (line != null) {
                String[] values = line.split(",");// lendo itens por virgulas usando o split
                String name = values[0];
                double price = Double.parseDouble(values[1]);
                int quantity = Integer.parseInt(values[2]);
                products.add(new Product(name, price, quantity));
                line = br.readLine();

            } // escrevendo no arquivo csv

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilestr))) {
                for (Product product : products) {
                    bw.write(product.getName() + "," + product.totalValue());
                    bw.newLine();

                }
            }

            catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            scanner.close();
        }

    }
}
