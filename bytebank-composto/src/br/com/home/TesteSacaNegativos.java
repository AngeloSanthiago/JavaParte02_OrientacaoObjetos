package br.com.home;

public class TesteSacaNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		
//		System.out.println(conta.saca(200));
		System.out.println(conta.saca(101));
		System.out.println(conta.getSaldo());
		
//		conta.saldo -= 101; // o ideal é encapsular o atributo
		System.out.println(conta.getSaldo());
		
//		conta.numero = -1377; // evitar que os atributos não estejam encapsulados
		
	}
}
