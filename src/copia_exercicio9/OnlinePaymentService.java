package copia_exercicio9;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
