import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Atividade_31.Entities.Employer;
import Atividade_31.Entities.OutsourcedEmployer;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Employer> lista = new ArrayList<>();
        System.out.println("Quantos funcionarios serão cadastrados?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dado do " + 1 + i + " funcionario");
            System.out.println("Será tercerizado? (y/n)");
            char ch = sc.next().charAt(0);
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Quantas horas? ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valor = sc.nextDouble();
            if (ch == 'y') {
                System.out.println("taba adicional");
                double taba = sc.nextDouble();
                lista.add(new OutsourcedEmployer(nome, horas, valor, taba));
            } else {
                lista.add(new Employer(nome, horas, valor));
            }
        }

        System.out.println("Pagamentos");
        for (Employer emp : lista) {
            System.out.println(emp.getName() + " - " + emp.paymant());
        }
        sc.close();
    }
}
