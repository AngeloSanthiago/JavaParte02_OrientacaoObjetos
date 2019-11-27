package br.com.home;

public class Conta {
	double saldo;
//	int agencia = 42; //com esta implementação todas as instâncias de conta nasceriam com o atributo agência iqual a 42
	int agencia;
	int numero;
	String titular;

	void deposita(double valor) {
		this.saldo += valor;
	}
}
