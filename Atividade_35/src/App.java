import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static void method1(){
        System.out.println("method 1 start");
        method2();
        System.out.println("method 1 end");

    }



    public static void method2() {
        System.out.println("method 2 start");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {//erro de digitar o indice que n existe 
            System.out.println("posição invalida");
            e.printStackTrace();//imprimir local do erro e nas linhas 
        } catch (InputMismatchException e) {//erro de digitar string e não inteiros 
            System.out.println("valor invalido");
        }
        System.out.println("method 2 end");

        sc.close();
    }
}
