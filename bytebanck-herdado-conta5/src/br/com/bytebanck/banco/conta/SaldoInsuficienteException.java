package br.com.bytebanck.banco.conta;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
