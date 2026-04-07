package model;

public abstract class ContaBancaria {

    private final int id;
    private final String titular;
    private double saldo;
    private StatusConta status;

    public ContaBancaria(int id, String titular) {
        this.id = id;
        this.titular = titular;
        this.saldo = 0;
        this.status = StatusConta.ATIVA;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public StatusConta getStatus() {
        return status;
    }

    public void setStatus(StatusConta status) {
        if (status == null) {
            throw new IllegalArgumentException("Status não pode ser nulo.");
        }
        this.status = status;
    }

    // 🔹 Validação de conta ativa
    protected void validarContaAtiva() {
        if (getStatus() != StatusConta.ATIVA) {
            throw new IllegalStateException("Conta não está ativa.");
        }
    }

    // 🔹 Validação de valor de depósito/saque
    protected void validarValorPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
    }

    // 🔹 Validação de saldo suficiente para saque
    protected void validarSaldoSuficiente(double valor) {
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
    }

    // 🔹Validar de saldo suficiente mesmo com limite
    protected void validarSaldoSuficienteComLimite(double valor, double limite) {
        if (valor > getSaldo() + limite) {
            throw new IllegalArgumentException("Saldo insuficiente, mesmo com limite.");
        }
    }


    // 🔹 Método para validar operações básicas (depósito e saque)
    protected void validarOperacaoBasica(double valor) {
    validarValorPositivo(valor);
    validarContaAtiva();
}

    // 🔹 Métodos abstratos
    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    // 🔹 Exibir dados
    @Override
    public String toString() {
        return "ContaBancaria{"
                + "id=" + id
                + ", titular='" + titular + '\''
                + ", saldo=" + saldo
                + ", status=" + status
                + '}';
    }
}
