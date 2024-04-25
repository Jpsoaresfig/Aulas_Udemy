import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quanto está o valor do dólar hoje? ");
        double dolar_atual = sc.nextDouble();
        System.out.println("Quantos dólares serão comprados?");
        double dolar_comprados = sc.nextDouble();
        
        double valor_convertido = CourrencyConverter.converterDolar(dolar_atual, dolar_comprados);
        double valor_com_iof = CourrencyConverter.dolarComIof(dolar_atual);
        
        // Formatando para três casas decimais
        String valor_convertido_formatado = String.format("%.3f", valor_convertido);
        
        System.out.println("Valor do IOF: " + valor_com_iof);
        System.out.println("Dólar convertido será: " + valor_convertido_formatado);
        
        sc.close();
    }
}
