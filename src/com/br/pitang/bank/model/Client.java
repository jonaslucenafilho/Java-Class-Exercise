package com.br.pitang.bank.model;

public class Client {
	
	private String name;
	private String cpf;
	private ClientType clientType;
	
	public Client (String name, String cpf, ClientType clientType ) {
		this.name = name;
		this.cpf = cpf;
		this.clientType = clientType;
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
	
	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public String toString() {
		return "Nome: "
			+ getName() 
			+ " CPF: "
			+ getCpf()
			+ " Tipo Cliente: "
			+ getClientType();
	}
}
