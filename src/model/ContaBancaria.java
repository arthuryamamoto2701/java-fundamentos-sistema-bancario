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

// ========================
// GETTERS / SETTERS
// ========================
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

    // ========================
    // 🔹 Métodos abstratos para implementação nas classes filhas
    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    // ========================
    // 🔹 Operações básicas para saldo
    protected void adicionarSaldo(double valor) {
        setSaldo(getSaldo() + valor);
    }

    protected void removerSaldo(double valor) {
        setSaldo(getSaldo() - valor);
    }

    // ========================
    // TO STRING
    // ========================
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
