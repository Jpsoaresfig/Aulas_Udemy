import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate d4 = LocalDate.parse("2024-09-16");
        LocalDateTime d5 = LocalDateTime.parse("2024-09-16T01:36:24");
        Instant d6 = Instant.parse("2024-09-16T01:36:24Z");

        // Converter Instant para ZonedDateTime, depois extrair LocalDate
        ZonedDateTime zonedDateTime = d6.atZone(ZoneId.systemDefault());
        LocalDate r1 = zonedDateTime.toLocalDate();
        LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));//data de portugal de acordo com r6 
        LocalDateTime r3 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));

        System.out.println("LocalDate d4: " + d4);
        System.out.println("LocalDateTime d5: " + d5);
        System.out.println("Instant d6: " + d6);
        System.out.println("LocalDate r1 (from Instant): " + r1);
        System.out.println("LocalDate r2 (from Instant): " + r2);
        System.out.println("LocalDateTime r3 (from Instant): " + r3);
        System.out.println();
        System.out.println("d4 = " +d4.getDayOfWeek());
        System.out.println("d4 = " +d4.getMonth());
        System.out.println("d5 = " +d4.getYear());
        System.out.println("d6 = "+d5.getHour());
    }
}
