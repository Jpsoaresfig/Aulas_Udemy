import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Marco");
        list.add(2, "Anna");

        System.out.println(list.size());// imprime tamanho da lista

        for (String x : list) {// imprimir itens da fila
            System.out.println(x);
        }
        System.out.println("-----------------------------");

        list.removeIf(x -> x.charAt(0) == 'M');// remover se tiver itens com m

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------------------");
        System.out.println("index of bob: " + list.indexOf("Bob"));// quantidade de vezes que aparece
        System.out.println("index of Marco: " + list.indexOf("Marco"));
        System.out.println("-----------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());// se o
                                                                                                         // removeif
                                                                                                         // estiver n
                                                                                                         // vai
                                                                                                         // funcionar ne
                                                                                                         // mane
        System.out.println(result);

        System.out.println("-----------------------------");
        String Name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // filtrar itens com J
        System.out.println(Name);
    }
}
