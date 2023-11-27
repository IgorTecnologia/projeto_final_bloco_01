package com.igor.goal.model;

public abstract class Model  {
	
	int id;
	String tipo;
	String nome;
	float preco;
	
	public Model(int id, String tipo, String nome, float preco) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualisar() {
		System.out.println("Número do produto: " + this.id);
		System.out.println("Tipo do produto: " + this.tipo);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço do produto: " + this.preco);
	}

}
