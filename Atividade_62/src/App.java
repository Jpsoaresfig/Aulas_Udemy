import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import java.util.stream.Collectors;

import Entities_62.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full  file path: ");
        String Path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(Path))) {
            List<Product> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();

            }
            double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y)/list.size();//pega a soma de todos os produtos e divide pelo tamanho da lista 
            System.out.println("Average price: " + avg);

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream().filter(p->p.getPrice() < avg).map(p-> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());
            System.out.println("Names of products with price lower than average: " + names);




        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
