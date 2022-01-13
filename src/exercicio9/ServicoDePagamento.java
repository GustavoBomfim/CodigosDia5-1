package exercicio9;

public interface ServicoDePagamento {
    double paymentFee (double contractValue);
    double interest (double contrac, int months);
}
