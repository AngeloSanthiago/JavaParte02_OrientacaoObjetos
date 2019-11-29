package br.com.home;

public class Conta {
	
	private double saldo;
//	int agencia = 42; //com esta implementa��o todas as inst�ncias de conta nasceriam com o atributo ag�ncia iqual a 42
	int agencia;
	int numero;
	Cliente titular;

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
	public double pegaSaldo() {
		return this.saldo;
	}
}
