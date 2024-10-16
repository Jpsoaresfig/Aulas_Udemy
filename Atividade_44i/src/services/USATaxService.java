package services;
public class USATaxService implements TaxService {

    @Override
    public double tax(double amount) {
        return amount * 0.1;
    }
}
