package com.br.pitang.bank.model;

public class Account {

	private String number;
	private double balance;
	private Client owner;
	
	public Account (String number, Client owner) {
		this.number = number;
		this.owner = owner;
	}

	public Account(String number, double balance, Client owner) {
		this.number = number;
		this.balance = balance;
		this.owner = owner;
	}
	
	public Account() {
		
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
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
		debit(value);
		destinyAccount.credit(value);
		
	}
	
}
