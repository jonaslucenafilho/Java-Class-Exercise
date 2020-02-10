package com.br.pitang.bank;

import com.br.pitang.bank.model.Account;
import com.br.pitang.bank.model.Client;

public class BankApplication {

	public static void main(String[] args) {
		
		Client c1 = new Client();
		c1.setCpf("05190955451");
		c1.setName("Jonas Lucena");
		
		Client c2 = new Client();
		c2.setCpf("06091984403");
		c2.setName("Marina Andrade");
		
		Account a1 = new Account();
		a1.setNumber("1509-1");
		a1.setOwner(c1);
		a1.setBalance(0);
		
		Account a2 = new Account();
		a2.setNumber("1007-3");
		a2.setOwner(c2);
		a2.setBalance(0);
		
		System.out.println("O valor do saldo da conta a1 é de R$ " + a1.getBalance());
		System.out.println("O valor do saldo da conta a2 é de R$ " + a2.getBalance());
		System.out.println();
		
		a1.credit(200.50);
		a2.credit(1000);
		
		System.out.println("O valor do saldo da conta a1 é de R$ " + a1.getBalance());
		System.out.println("O valor do saldo da conta a2 é de R$ " + a2.getBalance());
		System.out.println();
		
		a1.debit(100);
		a2.debit(300);
		
		System.out.println("O valor do saldo da conta a1 é de R$ " + a1.getBalance());
		System.out.println("O valor do saldo da conta a2 é de R$ " + a2.getBalance());
		System.out.println();
		
		a1.transfer(a2, 300.5);
		
		System.out.println("O valor do saldo da conta a1 é de R$ " + a1.getBalance());
		System.out.println("O valor do saldo da conta a2 é de R$ " + a2.getBalance());
		System.out.println();
	}

}
