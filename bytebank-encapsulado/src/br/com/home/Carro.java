package br.com.home;

public class Carro {
	private int ano;
	private String modelo;
	private double preco;

	public Carro(int ano, String modelo, double preco) {
		if (ano >= 1891) {
			this.ano = ano;
		} else {
			System.out.println("O ano informado est� inv�lido. Por isso usaremos 2017!");
			this.ano = 2017;
		}

		if (modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("O modelo n�o foi informado. Por isso usaremos Gol!");
			this.modelo = "Gol";
		}

		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("O pre�o n�o � v�lido. Por isso usaremos 40000.0!");
			this.preco = 40000.0;
		}
	}

	// Novo construtor para regra de negocio em que o ano do carro n�o � mais uma
	// inforama��o importante ou necess�ria
	public Carro(String modelo, double preco) {
		this(2017, modelo, preco);
	}

	// getters e setters omitidos

}
