import java.io.FileReader;
import java.io.BufferedReader;

public class App {//forma mais simples 
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\jpbus\\Desktop\\Teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
