package exercicio5;

public class Conta
{
    private int numeroConta;
    private String nomeCliente;
    private double balance;


    public Conta(int numeroConta, String nomeCliente){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
    }

    public Conta(int numeroConta, String nomeCliente, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        deposito(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    private double getBalance(){
        return balance;
    }
    private void setBalance(double balance){
        this.balance = balance;
    }
    public void deposito(double amount){
        balance += amount;
    }
    public void saque(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "account" + numeroConta + ", Holder: "
                + nomeCliente + ", Balance: " + String.format("%.2f",balance);
    }
}