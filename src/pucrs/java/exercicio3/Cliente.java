package pucrs.java.exercicio3;

public class Cliente {

	private String nome;
	private int cpf;
	private int idade;
	private char genero;
	
	public Cliente(String nome, int cpf, int idade, char genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public char getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return "Cliente nome: " + nome + ", cpf: " + cpf + ", idade: " + idade + ", genero: " + genero;
	}
	
	
	
}
