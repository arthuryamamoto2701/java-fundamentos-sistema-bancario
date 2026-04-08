package model;

import static validations.ContaValidations.*;

public class ContaPoupanca extends ContaBancaria {

    private static final double TAXA_JUROS_PADRAO = 0.5;
    private double taxaJuros;

    public ContaPoupanca(int id, String titular) {
        super(id, titular);
        this.taxaJuros = TAXA_JUROS_PADRAO;
    }

    @Override
    public void depositar(double valor) {
        validarOperacaoBasica(this, valor);
        adicionarSaldo(valor);;
    }

    @Override
    public void sacar(double valor) {
        validarOperacaoBasica(this, valor);
        validarSaldoSuficiente(this, valor);

        removerSaldo(valor);
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }


    //Validação para taxa de juros negativa
   public void setTaxaJuros(double taxaJuros) {
    validarTaxaJuros(taxaJuros);
    this.taxaJuros = taxaJuros;
}

    public void aplicarJuros() {
        validarContaAtiva(this);

        double rendimento = getSaldo() * (taxaJuros / 100);
        setSaldo(getSaldo() + rendimento);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", taxaJuros=" + taxaJuros;
    }
}