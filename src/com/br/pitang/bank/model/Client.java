package com.br.pitang.bank.model;

public class Client {
	
	private String name;
	private String cpf;
	
	public Client (String name, String cpf ) {
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
