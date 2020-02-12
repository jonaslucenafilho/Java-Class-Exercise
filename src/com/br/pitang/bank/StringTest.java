package com.br.pitang.bank;

public class StringTest {

	public static void main(String[] args) {
			
		String s1 = new String("Jonas");
		String s2 = new String("Jonas");
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);
		
		String s3 = "Marina";
		String s4 = "Marina";
		
		System.out.println(s3.equals(s4));
		
		System.out.println(s3 == s4);

		s3 = "Elilda";
		
		System.out.println(s3.equals(s4));
		
		System.out.println(s3 == s4);
		
	}

}
