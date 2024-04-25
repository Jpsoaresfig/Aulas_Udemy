public class CourrencyConverter {
    //função para pegar o valor do iof 
    public static double dolarComIof(double dolarAtual){ //Rever tudo, erro de lógica 
        double dolariof = dolarAtual * 0.06;
        return dolariof;
    }
    public static double converterDolar(double dolar_Atual, double dolar_comprados){
        double Dolarconvertido = dolar_Atual * dolar_comprados;
        return Dolarconvertido;

    }
}

