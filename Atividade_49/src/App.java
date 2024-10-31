import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import Entities49.LogEntry;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FILE FULL  PATH: ");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");// separando por espaço
                String username = fields[0];// localização do nome
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(username, moment));
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        sc.close();
    }
}
