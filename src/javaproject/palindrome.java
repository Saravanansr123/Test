package javaproject;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner x = new Scanner (System.in); 
		String p = x.next() ;
		for (int i=p.length()-1;i>=0;i--) {
			System.out.print(p.charAt(i));
		}

		
		
	}

}
