package 다중if문;

import java.util.Scanner;

public class Ex03다중if3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 입력 : ");
		
		String alphabet = sc.next(); //A~Z
		
		//.equals : 대소구분 , equalsIgnoreCase : 대소구분X
		
		if (alphabet.equals("A") || alphabet.equals("a")) {
			System.out.println("A입력");
		} else if (alphabet.equalsIgnoreCase("B") || alphabet.equals("b")) {
			System.out.println("B입력");
		} else if (alphabet.equalsIgnoreCase("c") || alphabet.equals("c")) {
			System.out.println("C입력");
		} else {
			System.out.println("A,B,C 외 입력");
		}
		
		
		System.out.print("알파벳 입력(char) : ");
		
		char b = sc.next().charAt(0); //A~Z
		
		if (b=='A') {
			System.out.println("A입력");
		} else if (b=='B') {
			System.out.println("B입력");
		} else if (b=='C' ) {
			System.out.println("C입력");
		} else {
			System.out.println("A,B,C 외 입력");
		}
		
		
		System.out.print("알파벳 입력(char-아스키코드) : ");
		
		char c = sc.next().charAt(0); //A~Z
		
		if (c==65) {
			System.out.println("A입력");
		} else if (c==66) {
			System.out.println("B입력");
		} else if (c==67) {
			System.out.println("C입력");
		} else {
			System.out.println("A,B,C 외 입력");
		}
		
		
		}
		
	}

