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

	public String getNumber() {
		return number;
	}

	private void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public Client getOwner() {
		return owner;
	}

	private void setOwner(Client owner) {
		this.owner = owner;
	}
	
	public double credit (double value) {
		this.balance += value;
		return this.balance;
	}
	
	public double debit (double value) {
		this.balance -= value;
		return this.balance;
	}
	
}
