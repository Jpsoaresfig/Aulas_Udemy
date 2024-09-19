package Atividade_27.src;
import Atividade_27.Entities.Departament;
import Atividade_27.Entities.HourContract;
import Atividade_27.Entities.Worker;
import Atividade_27.enums.WorkerLevel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o departamento que será colocado?");
        String depart = sc.nextLine();

        System.out.println("Coloque as informações do trabalhador:");

        System.out.println("Qual o nome do trabalhador?");
        String workerName = sc.nextLine();

        System.out.println("Qual o nível do trabalhador?");
        String workerLevel = sc.nextLine();

        System.out.println("Salário base: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(depart));

        System.out.println("Quantos contratos esse trabalhador vai ter?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Número do contrato #" + (i + 1) + " data");

            System.out.println("Data (dd/MM/yyyy): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Valor por hora: ");
            double valuePerHour = sc.nextDouble();

            System.out.println("Quantas horas esse trabalhador trabalhou?");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println("Entre com o mês e o ano (MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartament().getDepatarment());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
