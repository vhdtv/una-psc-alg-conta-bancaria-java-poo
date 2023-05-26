package contaBancaria;

public class contaBancariaPOO {
	private String nome, numeroConta;
	private double saldo = 0, valorDeposito, valorSaque;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double setSaldo(double saldo) {
		this.saldo = saldo;
		return this.saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public double setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
		return this.valorDeposito;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public double setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
		return this.valorSaque;
	}

	public double getValorSaque() {
		return valorSaque;
	}

	public double depositarValor(double valorDeposito) {
		saldo += valorDeposito;
		return saldo;
	}

	public double sacarValor(double valorSaque) {
		saldo -= valorSaque;
		return saldo;
	}
}