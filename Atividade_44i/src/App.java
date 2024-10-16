
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import Model44.CarRental;
import Model44.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel : ");

        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carrental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());// deixe o dos EUA com Exemplo 

        rentalService.processInvoice(carrental);

        System.out.println("Datura: ");
        System.out.println("Pagamento basico: " + carrental.getInvoice().getBasicPaymant());
        System.out.println("Imposto: " + carrental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carrental.getInvoice().getTotalPaymant());
        sc.close();
    }
}
