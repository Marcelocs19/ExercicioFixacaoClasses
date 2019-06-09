package pucrs.java.exercicio1e2;

public class ContaCorrente {

	private int nroConta;
	private double valorConta;
		
	public ContaCorrente(int nroConta, double valorConta) {
		this.nroConta = nroConta;
		this.valorConta = valorConta;
	}
	
	public void deposito(double valor) {
		valorConta += valor;
	}

	public double retirada(double valor) {
		return valorConta = valorConta - valor;
	}

	public double getSaldo() {
		return valorConta;
	}

	public int getNroConta() {
		return nroConta;
	}

	@Override
	public String toString() {
		return "ContaCorrente nroConta: " + nroConta + ", valorConta: " + valorConta;
	}
	
	
}
