package br.com.home;

public class TesteDeReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeria: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da primeria: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("primeira e segunda conta são iguais");
			
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
