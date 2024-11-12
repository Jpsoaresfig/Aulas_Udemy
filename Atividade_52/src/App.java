import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.println("Enter the file path :");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    votes.put(name, votes.get(name) + count);

                } else {
                    votes.put(name, count);
                }
                line = br.readLine();

            }
            for (String Key : votes.keySet()) {
                System.out.println(Key + " " + votes.get(Key));
            }

            sc.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
