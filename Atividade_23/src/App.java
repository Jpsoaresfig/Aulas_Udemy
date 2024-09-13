
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class App {
    public static void main(String[] args) throws Exception {
        LocalDate dt4 = LocalDate.parse("2024-09-20");
        LocalDateTime dt5 = LocalDateTime.parse("2024-09-20T13:52:20");
        LocalDateTime dt6 = LocalDateTime.parse("2024-09-20T13:52:20");
        Instant dt7 = Instant.parse("2024-09-20T13:52:20Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("Data "+ dt4.format(fmt1));
        System.out.println("Data "+ fmt1.format(dt4));
        System.out.println("Data "+ dt5.format(fmt2));
        System.out.println("Data "+ dt6.format(fmt3));
        System.out.println("Data "+ fmt4.format(dt7));
        System.out.println("Data "+ dt6.format(fmt5));


    }
}
