package services;

import java.time.Duration;

import Model44.CarRental;
import Model44.Invoice;

public class RentalService {
    private double pricePerDay;
    private double pricePerHour;

    private TaxService taxService;

    public RentalService(double pricePerDay, double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12) {
            basicPayment = Math.ceil(hours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }

        
        double tax = taxService.tax(basicPayment);

        Invoice invoice = new Invoice(basicPayment, tax);
        carRental.setInvoice(invoice);
    }

}
