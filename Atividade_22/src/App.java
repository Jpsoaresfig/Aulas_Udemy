import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato de data e hora

        LocalDate dt1 = LocalDate.now(); // Data atual
        LocalDateTime dt2 = LocalDateTime.now(); // Data e hora atuais
        Instant dt3 = Instant.now(); // Instante atual
        LocalDate dt4 = LocalDate.parse("2024-09-20"); // Converte string para LocalDate
        LocalDateTime dt5 = LocalDateTime.parse("2024-09-21T13:52:24"); // Converte string para LocalDateTime
        Instant dt6 = Instant.parse("2024-09-21T13:52:24Z"); // Converte string para Instant (UTC)
        Instant dt7 = Instant.parse("2024-09-21T13:52:24-03:00"); // Converte string para Instant com fuso horário
        LocalDate dt8 = LocalDate.parse("02/10/2024", fmt1); // Data com formato customizado
        LocalDateTime dt9 = LocalDateTime.parse("02/10/2024 01:20", fmt2); // Data e hora com formato customizado
        LocalDate dt10 = LocalDate.of(2024, 2, 2); // Cria LocalDate manualmente
        LocalDateTime dt11 = LocalDateTime.of(2024, 2, 23, 10, 12, 22); // Cria LocalDateTime manualmente

        System.out.println("Somente data: " + dt1); // Imprime LocalDate
        System.out.println("Data e hora: " + dt2); // Imprime LocalDateTime
        System.out.println("Data e hora instantânea: " + dt3); // Imprime Instant
        System.out.println("Data: " + dt4); // Imprime LocalDate parseado
        System.out.println("Data e hora: " + dt5); // Imprime LocalDateTime parseado
        System.out.println("Data e hora instantânea: " + dt6); // Imprime Instant (UTC)
        System.out.println("Data e hora instantânea com fuso horário: " + dt7); // Imprime Instant com fuso horário
        System.out.println("Formato correto: " + dt8); // Imprime LocalDate com formato customizado
        System.out.println("Formato correto: " + dt9); // Imprime LocalDateTime com formato customizado
        System.out.println("Formato correto: " + dt10); // Imprime LocalDate criado manualmente
        System.out.println("Formato correto: " + dt11); // Imprime LocalDateTime criado manualmente
    }
}
