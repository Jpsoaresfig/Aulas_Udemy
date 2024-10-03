package Atividade_31.Entities;

public class OutsourcedEmployer extends Employer {

    private double additionalCharge;

    public OutsourcedEmployer(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployer(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double paymant() {
        return super.paymant() + additionalCharge;
    }
}
