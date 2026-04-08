package model;

import static validations.ContaValidations.*;

public class ContaCorrente extends ContaBancaria {

    private double limiteContaCorrente;

    public ContaCorrente(int id, String titular, double limiteContaCorrente) {
        super(id, titular);
        this.limiteContaCorrente = limiteContaCorrente;
    }

    public double getLimiteContaCorrente() {
        return limiteContaCorrente;
    }

    @Override
    public void depositar(double valor) {
        validarOperacaoBasica(this, valor);
        adicionarSaldo(valor);
    }

    @Override
    public void sacar(double valor) {
        validarOperacaoBasica(this, valor);
        validarSaldoComLimite(this, valor, limiteContaCorrente);

        removerSaldo(valor);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", limiteContaCorrente=" + limiteContaCorrente;
    }
}