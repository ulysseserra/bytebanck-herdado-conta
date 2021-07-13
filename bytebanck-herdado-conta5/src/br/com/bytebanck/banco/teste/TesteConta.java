package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.conta.ContaCorrente;
import br.com.bytebanck.banco.conta.ContaPoupanca;
import br.com.bytebanck.banco.conta.SaldoInsuficienteException;

public class TesteConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(2467, 393800);
		cc.deposita(100.0);;
		
		ContaPoupanca cp = new ContaPoupanca(6610, 3603200);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
