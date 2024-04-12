import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int  soma = 0;
        for(int i = 0 ; i < 5; i++ ){
            System.out.println("Digite Um número:");
            x = sc.nextInt(); 
            soma = x + soma;
        }

        System.out.println("A soma dos valores digitados é de " + soma);

    }
}
