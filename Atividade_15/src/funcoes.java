public class funcoes {
    public static double media(int n, double[] vector) {

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vector[i];
        }
      double  media = sum / n;
        return media;
    }
    
}
