
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

import Entities45.Contract;
import Entities45.Installment;
import Service45.ContractService;
import Service45.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Data(dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Valor do contrato: ");
        double valor = sc.nextDouble();
        Contract contract = new Contract(numero, date, valor);

        System.out.println("Entre com os numeros da parcela: ");
        int parcela = sc.nextInt();

        ContractService contractService = new ContractService( new PaypalService());
        contractService.ProcessContract(contract, parcela);

        System.out.println("Parcelas: ");
        for (Installment installments : contract.getintallment()) {
            System.out.println(installments);
        }

        sc.close();

    }
}
