package model;

public class ContaCorrente extends ContaBancaria {

   
    private double limiteContaCorrente;

   
    public ContaCorrente(int id, String titular, double saldo, double limiteContaCorrente) {
    super(id, titular);
    this.limiteContaCorrente = limiteContaCorrente;
}

    public double getLimiteContaCorrente() {
        return limiteContaCorrente;
    }

    @Override
    public void depositar(double valor) {
        
        validarOperacaoBasica(valor);

        setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {

        validarOperacaoBasica(valor);

        validarSaldoSuficienteComLimite(valor, limiteContaCorrente);

        setSaldo(getSaldo() - valor);
        //caso contrario o valor é sacado normalmente, subtraindo o valor do saque do saldo atual da conta.
    }

    @Override
    public String toString() {
        return super.toString()
                + ", limiteContaCorrente=" + limiteContaCorrente;
    }
}