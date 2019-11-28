package br.com.home;

public class Conta {
	double saldo;
//	int agencia = 42; //com esta implementação todas as instâncias de conta nasceriam com o atributo agência iqual a 42
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
