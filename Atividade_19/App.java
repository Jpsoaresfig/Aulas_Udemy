package Atividade_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Atividade_19.src.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Empregado> list = new ArrayList<>();// Itens do Empregado

        System.out.println("Quantos funcionarios serão registrados ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salario: ");
            double salary = sc.nextDouble();
            list.add(new Empregado(id, name, salary));// adicionando a lista de itens
        }

        System.out.println(("Qual o id do salario que sera ira aumentar?"));
        double IDsalario = sc.nextInt();
        Integer pos = posicao(list, IDsalario);

        if (pos == null) {
            System.out.println("Funcionario nao encontrado");
        } else {
            System.out.println("Quantos % quer aumentar? ");
            double porcentagem = sc.nextDouble();
            list.get(pos).AumentarSalario(porcentagem);// pegado o id da fila encontrado e aumentando o salario

            System.out.println("Lista de funcionarios ");

            for (Empregado empregado : list) {
                System.out.println(empregado);
            }
        }

        sc.close();
    }

    public static Integer posicao(List<Empregado> list,double tiDsalarioo) {// verificar se posição do id existe

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() ==tiDsalarioo) {
                return i;
            }
        }
        return null;
    }

}