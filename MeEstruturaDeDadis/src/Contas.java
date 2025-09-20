public class Contas {
    int numeroConta;
    String titular;
    String cpf;
    double saldo;
    String tipoConta;
    String dataAbertura;
    boolean ativa;

    public Contas(boolean ativa, String cpf, String dataAbertura, int numeroConta, double saldo, String tipoConta, String titular) {
        this.ativa = ativa;
        this.cpf = cpf;
        this.dataAbertura = dataAbertura;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.titular = titular;
    }


}
