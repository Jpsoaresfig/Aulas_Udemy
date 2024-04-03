import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("digite um dia da semana");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("domingo");
                break;

            case 2:
                System.out.println("segunda");
                break;

            case 3:
                System.out.println("terça");
                break;

            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7: 
            System.out.println("sabado");
                break;
        }
        sc.close();
    }

}