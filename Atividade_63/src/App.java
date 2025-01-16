import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entities_63.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o caminho do arquivo? ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

            }
            
            System.out.println("QUal o salário ?");
            double salary = sc.nextDouble();

            //fazer a soma total de todos os salarios 
            double total = list.stream().mapToDouble(Employee :: getSalary).sum();//método sum soma todos os valores do stream 

            //pegando o salario maior que o salario digitado
            List<String> email = list.stream().filter(t -> t.getSalary() > salary).map(Employee::getEmail).collect(Collectors.toList());
                    
            System.out.println("os salários maiores que " + salary + " são: " + email);
            System.out.println("Soma total dos salários: " + total);

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
