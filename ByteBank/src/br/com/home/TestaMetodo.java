package br.com.home;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contadDPaulo = new Conta();
		contadDPaulo.saldo = 100;
		contadDPaulo.deposita(50);
		System.out.println(contadDPaulo.saldo);
	}
}
