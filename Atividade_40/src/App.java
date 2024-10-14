import java.io.FileReader;
import java.io.BufferedReader;

public class App {//forma mais dificil 
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\jpbus\\Desktop\\Teste.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
