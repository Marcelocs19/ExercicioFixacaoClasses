package pucrs.java.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Bar {

	private List<Cliente> listaClientes = new ArrayList<Cliente>();

	public Bar(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public boolean pesquisaCPF(int cpf) {
		boolean contem = false;
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getCpf() == cpf) {
				contem = true;
			}
		}
		return contem;
	}

	public int nroTotalPessoas() {
		return listaClientes.size();
	}

	public void distribuicaoGenero() {
		double nroMasculino = 0, nroFeminino = 0;
		for(int i = 0; i < listaClientes.size(); i++) {
			if(listaClientes.get(i).getGenero() == 'M') {
				nroMasculino++;
			}
			else {
				nroFeminino++;
			}
		}
		System.out.println("Número de Homens: " + ((nroMasculino/nroTotalPessoas()) * 100) + "%" + "\nNúmero de Mulheres: " + ((nroFeminino/nroTotalPessoas()) * 100) + "%");
	}
	
	public boolean sairBar(int cpf) {
		boolean sair = false;
		for(int i = 0; i < listaClientes.size(); i++) {
			if(listaClientes.get(i).getCpf() == cpf) {
				listaClientes.remove(i);
				sair = true;
			}
		}
		return sair;
	}

}
