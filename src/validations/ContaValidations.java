package validations;

import exceptions.ContaInativaException;
import exceptions.SaldoInsuficienteException;
import exceptions.TaxaJurosInvalidaException;
import exceptions.ValorInvalidoException;
import model.ContaBancaria;
import model.StatusConta;

public final class ContaValidations {

    private ContaValidations() {
        // impede instanciação
    }

    // 🔹 Conta ativa
    public static void validarContaAtiva(ContaBancaria conta) {
        if (conta.getStatus() != StatusConta.ATIVA) {
            throw new ContaInativaException("Conta não está ativa.");
        }
    }

    // 🔹 Valor positivo
    public static void validarValorPositivo(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor deve ser maior que zero.");
        }
    }

    // 🔹 Saldo suficiente (sem limite)
    public static void validarSaldoSuficiente(ContaBancaria conta, double valor) {
        if (valor > conta.getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
    }

    // 🔹 Saldo suficiente (com limite)
    public static void validarSaldoComLimite(ContaBancaria conta, double valor, double limite) {
        if (valor > conta.getSaldo() + limite) {
            throw new SaldoInsuficienteException("Saldo insuficiente, mesmo com limite.");
        }
    }

    // 🔹 Validação base (depósito/saque)
    public static void validarOperacaoBasica(ContaBancaria conta, double valor) {
        validarValorPositivo(valor);
        validarContaAtiva(conta);
    }

    // 🔹 Taxa de juros válida (não pode ser negativa)
    public static void validarTaxaJuros(double taxaJuros) {
        if (taxaJuros < 0) {
            throw new TaxaJurosInvalidaException("Taxa de juros não pode ser negativa.");
        }
    }
}
