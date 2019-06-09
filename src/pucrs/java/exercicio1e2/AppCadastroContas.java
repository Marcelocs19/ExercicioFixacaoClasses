package pucrs.java.exercicio1e2;

import java.util.ArrayList;
import java.util.List;

public class AppCadastroContas {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(1111, 2000);
		ContaCorrente c2 = new ContaCorrente(2222, 4000);
		ContaCorrente c3 = new ContaCorrente(3333, 20000);
		ContaCorrente c4 = new ContaCorrente(4444, 10000);
		ContaCorrente c5 = new ContaCorrente(5555, 6000);

		List<ContaCorrente> listaContas = new ArrayList<ContaCorrente>();
		listaContas.add(c1);
		listaContas.add(c2);
		listaContas.add(c3);
		listaContas.add(c4);
		listaContas.add(c5);
		
		CadastroDeContas cc = new CadastroDeContas(listaContas);
		
		System.out.println("Pesquisa Conta Corrente: "  + cc.getConta(3333));
		System.out.println("Saldo total das Contas Correntes: " + cc.getSaldoTotal());
		System.out.println("Contas que tem o saldo minimo ou maior 6000: " + cc.qtdContas(6000));
		System.out.println("Lista de Contas: " + cc.getListaContaCorrente());
	}

}
