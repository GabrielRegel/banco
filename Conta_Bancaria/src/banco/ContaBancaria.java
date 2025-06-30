package banco;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    
    
    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            System.out.println("Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            System.out.println("Saldo atual: R$" + saldo);
        }
    }
    
    
    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Nome do titular inválido.");
        }
    }

    public void mostrarDados() {
        System.out.println("\n=== DADOS DA CONTA ===");
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("======================");
    }
}