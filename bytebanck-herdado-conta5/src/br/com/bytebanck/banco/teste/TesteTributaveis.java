package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.conta.CalculadorDeImposto;
import br.com.bytebanck.banco.conta.ContaCorrente;
import br.com.bytebanck.banco.conta.SeguroDeVida;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registro(cc);
		calc.registro(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
