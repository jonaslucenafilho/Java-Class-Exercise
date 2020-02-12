package com.br.pitang.bank.model;

public class Account {

	private String number;
	private double balance;
	private Client client;
	
	public Account (String number, Client client) {
		this.number = number;
		this.client = client;
	}

	public Account(String number, double balance, Client client) {
		this(number, client);
		this.balance = balance;
	}
	
	public Account() {
		
	}

	public String getNumber() {
		return this.number;
	}

	private void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return this.balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public Client getClient() {
		return this.client;
	}

	private void setClient(Client client) {
		this.client = client;
	}
	
	public double credit (double value) {
		this.balance += value;
		return this.balance;
	}
	
	public double debit (double value) {
		if (value > this.getBalance()) {
			System.out.println("A operação não pode ser realizada!");
			System.out.println("Saldo insuficiente!");
			return this.balance;
		} else {
			this.balance -= value;
			System.out.println("Operação realizada com sucesso!");
			return this.balance;
		}
	}
	
	public void transfer (Account destinyAccount, double value) {
		if (value > this.getBalance()) {
			System.out.println("A operação não pode ser realizada!");
			System.out.println("Saldo insuficiente!");
		} else {
			debit(value);
			destinyAccount.credit(value);
		}
		
		
	}
	
}
