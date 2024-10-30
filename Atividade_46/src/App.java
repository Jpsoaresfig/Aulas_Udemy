import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> myInsts = Arrays.asList(5, 2, 10);
        printList(myInsts);

        List<String> myStrings = Arrays.asList("Maria", "alex", "bob");
        printList(myStrings);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }

    }
}
