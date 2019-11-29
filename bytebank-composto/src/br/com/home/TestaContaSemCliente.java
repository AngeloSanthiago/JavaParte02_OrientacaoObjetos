package br.com.home;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
//		System.out.println(contaDaMarcela.saldo); Não compila mais pois o atributo ficou private
		System.out.println(contaDaMarcela.pegaSaldo());
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
	}
}
