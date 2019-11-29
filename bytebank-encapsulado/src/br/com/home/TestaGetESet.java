package br.com.home;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
//		conta.numero = -1337; Não compila
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	}
}
