package pucrs.java.exercicio1e2;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeContas {

	private List<ContaCorrente> listaContaCorrente = new ArrayList<ContaCorrente>();
	
	public CadastroDeContas(List<ContaCorrente> listaContaCorrente) {
		this.listaContaCorrente = listaContaCorrente;
	}

	public boolean novaContaCorrente(ContaCorrente c) {
		if (listaContaCorrente.contains(c)) {
			return false;
		} else {
			return true;
		}
	}

	public ContaCorrente getConta(int nroCta) {
		ContaCorrente conta = null;
		for(int i = 0; i < listaContaCorrente.size(); i++) {
			if(listaContaCorrente.get(i).getNroConta() == nroCta) {
				conta = listaContaCorrente.get(i);
			}
		}
		return conta;
	}
	
	public double getSaldoTotal() {
		double saldoTotal = 0;
		for(int i = 0; i < listaContaCorrente.size(); i++) {
			saldoTotal += listaContaCorrente.get(i).getSaldo();
		}		
		return saldoTotal;
	}

	public int qtdContas(double noMinimo) {
		int contasMinimo = 0;
		for(int i = 0; i < listaContaCorrente.size(); i++) {
			if(listaContaCorrente.get(i).getSaldo() >= noMinimo) {
				contasMinimo++;
			}
		}
		return contasMinimo;
	}

	public List<ContaCorrente> getListaContaCorrente() {
		return listaContaCorrente;
	}

}
