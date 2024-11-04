import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Set<Integer> CourseA = new HashSet<>();
        Set<Integer> CourseB = new HashSet<>();
        Set<Integer> CourseC = new HashSet<>();

        System.out.println("How many studens for a cours A? ");
        int A = sc.nextInt();

        for (int i = 0; i < A; i++) {
            System.out.println("Studant number" + (i + 1));
            int ida = sc.nextInt();
            CourseA.add(ida);
        }

        System.out.println("How many studens for a cours B? ");
        int B = sc.nextInt();

        for (int i = 0; i < B; i++) {
            System.out.println("Studant number" + (i + 1));
            int idb = sc.nextInt();
            CourseB.add(idb);
        }

        System.out.println("How many studens for a cours B? ");
        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            System.out.println("Studant number" + (i + 1));
            int idb = sc.nextInt();
            CourseB.add(idb);
        }

        Set<Integer> total = new HashSet<>();
        total.addAll(CourseC);
        total.addAll(CourseB);
        total.addAll(CourseA);
        System.out.println("O total de alunos é de " + total.size());

        sc.close();
    }
}
