package Service45;

public class PaypalService implements OnlinePaymantService {

    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public double paymantFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public Double interest(double amount, int month) {

        return amount * MONTHLY_INTEREST * month;

    }

}
