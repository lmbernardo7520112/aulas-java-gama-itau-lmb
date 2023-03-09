public class CelularPrePago {
    private String nomeCliente;
    private String telefone;
    private double saldo;

    public CelularPrePago(String telefone) {
        this.telefone = telefone;
        this.saldo = 0;
    }

    public CelularPrePago(String nomeCliente, String telefone, double saldo) {
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void fazerLigacao() {
        if (saldo >= 0.75) {
            saldo -= 0.75;
            System.out.println("Ligação realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para fazer a ligação.");
        }
    }

    public void recarregar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Recarga realizada com sucesso!");
        } else {
            System.out.println("Valor inválido para recarga.");
        }
    }

    public String imprimir() {
        return "Nome do cliente: " + nomeCliente +
               "\nTelefone: " + telefone +
               "\nSaldo: R$ " + saldo;
    }
}
