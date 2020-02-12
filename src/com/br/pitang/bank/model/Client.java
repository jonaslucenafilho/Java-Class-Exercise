package com.br.pitang.bank.model;

public class Client {
	
	private String name;
	private String cpf;
	ClientType clienttype;
	
	public Client (String name, String cpf ) {
		this.name = name;
		this.cpf = cpf;
	}
	
	public Client() {
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public ClientType getClienttype() {
		return clienttype;
	}

	public void setClienttype(ClientType clienttype) {
		this.clienttype = clienttype;
	}

}
