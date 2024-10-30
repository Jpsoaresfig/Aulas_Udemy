import Entities47.Client;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*hashCode
        String a = "Maria";
        String b =  "Alex";

        System.out.println(a.hashCode());rapido
        System.out.println(b.hashCode());Tem risco

        equals
        System.out.println(a.equals(b));seguro*/

        Client c1 = new Client("bob", "maria@gmail");
        Client c2 = new Client("Bob", "maria@gmail");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

    }
}
