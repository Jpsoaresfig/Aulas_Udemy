import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String product1 = "computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products :  "+ product1 +" witch price is "+ price1);
        System.out.println(product2+" wich the price is "+price2);
        System.out.println("record: " +age+" years old code " +code+ " and gender "+gender);
        System.out.println("measue with eight decimal places: " +measure);
        System.out.printf("(three decimal places): %.3f%n " , measure);
        Locale us = Locale.US;
        System.out.printf(Locale.US, "us decimal point %.3f%n ",measure);
        

    }
}