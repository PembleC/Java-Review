// Abstract - Assignment 1
// Carson Pemble
// 11/02/2020

abstract class Payment{
    //Implement your code here
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;

    public Payment(int customerId){
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(double serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }

    public abstract double payBill(double amount);
}

class DebitCardPayment extends Payment{
    //Implement your code here
    private static int counter = 1000;
    private double discountPercentage;

    // static {
    //     counter = 1000;
    // }

    public DebitCardPayment(int customerId){
        super(customerId);
        counter++;
        String paymentId = "D" + counter;
        setPaymentId(paymentId);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        DebitCardPayment.counter = counter;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double payBill(double amount){
        if(amount <= 500){
            serviceTaxPercentage = 2.5;
            setDiscountPercentage(1);
        } else if (amount > 500 && amount <=1000){
            serviceTaxPercentage = 4;
            setDiscountPercentage(2);
        } else {
            serviceTaxPercentage = 5;
            setDiscountPercentage(3);
        }
        return amount + (amount*(serviceTaxPercentage/100)) - (amount*(discountPercentage/100));
    }
}

class CreditCardPayment extends Payment{
    //Implement your code here
    private static int counter = 1000;
    // static {
    //     counter = 1000;
    // }

    public CreditCardPayment(int customerId){
        super(customerId);
        counter++;
        String paymentId = "C" + counter;
        setPaymentId(paymentId);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CreditCardPayment.counter = counter;
    }

    public double payBill(double amount){
        if(amount <= 500){
            serviceTaxPercentage = 3;
        } else if (amount > 500 && amount <=1000){
            serviceTaxPercentage = 5;
        } else {
            serviceTaxPercentage = 6;
        }
        return amount + (amount*(serviceTaxPercentage/100));
    }

}

class Tester{
    public static void main(String args[]){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
        System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
        System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
        System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
        System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
        System.out.println("Total bill amount: " + billAmount);

        CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
        System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
        System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
        System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
        System.out.println("Total bill amount: " + billAmount);
    }
}
