package pucrs.java.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class AppBar {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Marcelo", 1111, 29, 'M');
		Cliente c2 = new Cliente("Barbara", 2222, 25, 'F');
		Cliente c3 = new Cliente("Joao", 3333, 18, 'M');
		Cliente c4 = new Cliente("Mateus", 4444, 24, 'M');
		Cliente c5 = new Cliente("Leticia", 5555, 22, 'F');
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes.add(c1);
		listaClientes.add(c2);
		listaClientes.add(c3);
		listaClientes.add(c4);
		listaClientes.add(c5);
		
		Bar bar = new Bar(listaClientes);
		
		System.out.println("Pessoas no Bar: " + bar.getListaClientes());
		System.out.println("Pesquisa CPF: " + bar.pesquisaCPF(1111));
		System.out.println("Distribuição de Genero: ");
		bar.distribuicaoGenero();
		System.out.println("Numero total de Pessoas: " + bar.nroTotalPessoas());
		System.out.println("Sair do Bar: " + bar.sairBar(1111));
		System.out.println("Pessoas no Bar: " + bar.getListaClientes());
		
	}

}
