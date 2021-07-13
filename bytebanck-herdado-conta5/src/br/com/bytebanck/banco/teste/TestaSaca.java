package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.conta.Conta;
import br.com.bytebanck.banco.conta.ContaCorrente;
import br.com.bytebanck.banco.conta.SaldoInsuficienteException;

public class TestaSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
		conta.saca(190.0);
		} catch(SaldoInsuficienteException ex) {
		System.out.println("Ex: " + ex.getMessage());
	    }
		System.out.println(conta.getSaldo());
	}
}
