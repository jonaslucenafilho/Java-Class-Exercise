package com.br.pitang.bank;

import com.br.pitang.bank.model.Account;
import com.br.pitang.bank.model.Client;

public class BankApplication {

	public static void main(String[] args) {
		
		Client c1 = new Client();
		
		Account a1 = new Account();
		Account a2 = new Account();
		
		a1.setBalance(100);
		a2.setBalance(0);
	}

}
