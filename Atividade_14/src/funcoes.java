public class funcoes {

    public static double media(int n, double[] vector) {

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vector[i];
        }
        double media = sum / n;
        return media;
    }

    public double media;
    public int soma;

    public static double soma(int n, double[] vector) {
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vector[i];
        }
        return soma;
    }

}