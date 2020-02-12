package com.br.pitang.bank.model;

public class ClientsArrayRepository {

	private Client[] clients;
	private int index = -1;
	private static final int CACHE_SIZE = 100;
	
	public ClientsArrayRepository() {
		clients = new Client[CACHE_SIZE];
	}
	
	public void insert(Client c) {
		index++;
		clients[index] = c;
	}
	
	public int searchingIndex(String cpf) {
		for (int i = 0; i <= index; i++) {
			if(clients[i].getCpf().equals(cpf)); {
				return i;
			}
		} return -1;
	} 
	
	public boolean exist(String cpf) {
		if (searchingIndex(cpf) != -1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public Client search(String cpf) {
		int searchIndex = searchingIndex(cpf);
		if (searchIndex != -1) {
			return clients[searchIndex];
		} else {
			return null;
		}
	}
	
	public void update(Client c) {
		int clientIndex = searchingIndex(c.getCpf());
		if (clientIndex != -1) {
			clients[clientIndex] = c;
		} else {
			System.out.println("Cliente Inválido!");
		}
	}
	
	public void remove(Client c) {
		int clientIndex = searchingIndex(c.getCpf());
		if (clientIndex != -1) {
			clients[clientIndex] = null;
		} else {
			System.out.println("Cliente não existe!");
		}
	}
	
	public void getInfos() {
		for (int i = 0; i <= index; i++) {
			System.out.println(clients[i].toString());
		}
	}
}
