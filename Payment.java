public class Payment {
    private double amount;
    private String currency;
    private String paymentMethod;
    private String status;

    public Payment(double amount, String currency, String paymentMethod) {
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
        this.status = "PENDING";
    }

    public void processPayment() {
        if ("PENDING".equals(status)) {
            this.status = "COMPLETED";
            System.out.println("Payment of " + amount + " " + currency + " via " + paymentMethod + " completed.");
        } else {
            System.out.println("Payment cannot be processed. Current status: " + status);
        }
    }

    public void cancelPayment() {
        if ("PENDING".equals(status)) {
            this.status = "CANCELED";
            System.out.println("Payment of " + amount + " " + currency + " has been canceled.");
        } else {
            System.out.println("Payment cannot be canceled. Current status: " + status);
        }
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Payment payment = new Payment(100.0, "USD", "Credit Card");
        System.out.println(payment);

        payment.processPayment();
        System.out.println(payment);

        payment.cancelPayment(); 
    }
}
