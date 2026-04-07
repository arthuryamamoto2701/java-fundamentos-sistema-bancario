package model;

public class ContaPoupanca extends ContaBancaria {

    private static final double TAXA_JUROS_PADRAO = 0.5;
    private double taxaJuros;

    public ContaPoupanca(int id, String titular) {
        super(id, titular);
        this.taxaJuros = TAXA_JUROS_PADRAO;
    }

    @Override
    public void depositar(double valor) {

       validarOperacaoBasica(valor);

        setSaldo(getSaldo() + valor);
    }

    // 🔹 Método para validar saldo suficiente considerando o limite da conta corrente
    @Override
    public void sacar(double valor) {

        validarOperacaoBasica(valor);
        validarSaldoSuficiente(valor);

    setSaldo(getSaldo() - valor);
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    // 🔹 Método que valida que a taxa de juros não pode ser negativa
    public void setTaxaJuros(double taxaJuros) {

        if (taxaJuros < 0) {
            throw new IllegalArgumentException("Taxa de juros não pode ser negativa.");
        }

        this.taxaJuros = taxaJuros;
    }

    // 🔹 Método para aplicar juros ao saldo da conta poupança
    public void aplicarJuros() {
    validarContaAtiva();

    double rendimento = getSaldo() * (taxaJuros / 100);
    setSaldo(getSaldo() + rendimento);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", taxaJuros=" + taxaJuros;
    }
}