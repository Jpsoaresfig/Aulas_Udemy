import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate d4 = LocalDate.parse("2024-09-16");
        LocalDateTime d5 = LocalDateTime.parse("2024-09-16T01:36:24");
        Instant d6 = Instant.parse("2024-09-16T01:36:24Z");

        // Subtrações e adições
        LocalDate menosumasemana = d4.minusWeeks(1);
        LocalDateTime menosumahora = d5.minusHours(2);
        Instant menos2minuto = d6.minusSeconds(120);
        LocalDate maisumasemana = d4.plusWeeks(1);
        Instant menos2dias = d6.minus(7, ChronoUnit.DAYS); // Diminuir dias do Instant 
        
        // Usar Period para calcular a diferença entre LocalDates
        Period p1 = Period.between(d4, maisumasemana);
        
        // Usar Duration para calcular a diferença em horas
        Duration d1 = Duration.between(menosumahora, d5); // Diferença entre LocalDateTimes

        System.out.println("Menos uma semana: " + menosumasemana);
        System.out.println("Menos duas horas: " + menosumahora);
        System.out.println("Menos dois minutos (Instant): " + menos2minuto);
        System.out.println("Mais uma semana: " + maisumasemana);
        System.out.println("Menos dois dias (Instant): " + menos2dias);
        System.out.println("Diferença em semanas (Period): " + p1);
        System.out.println("Diferença em horas (Duration): " + d1.toHours() + " horas");
    }
}
