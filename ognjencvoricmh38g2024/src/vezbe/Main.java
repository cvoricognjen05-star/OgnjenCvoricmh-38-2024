package vezbe;

import java.util.Scanner;

public class Main {
//	Deklarisanje i inicijalizacija
	public static void prvaVezba() {
//		Deklarisanje
		int broj;
//		Inicijalizacija
		broj = 50;
		broj = 20;
		broj = 30;
//		Nevalidno
//		broj = "Tekst";
//		broj = 50.5;
		
//		Deklarisanje i inicijalizacija istovremeno
		double decimalniBroj = 50.5;
		String tekst = "Nas prvi string";
		
		System.out.println(broj);
		System.out.println("Decimalni broj koji imamao je: " + decimalniBroj);
		System.out.println(tekst);
	}
//  parni i neparni brojevi - if else struktura
	public static void drugaVezba() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = scanner.nextInt();
//		Operator koji se zove moduo sluzi za racunanje ostatka pri deljenju - %
		if(broj % 2 == 0) {
			System.out.println("Broj " + broj + "je paran");
		}
		else {
			System.out.println("Broj " + broj + "je neparan");
		}
	}
	public static void trecaVezba() {
		System.out.println("Unesite broj");
		Scanner scanner = new Scanner(System.in);
		int broj = scanner.nextInt();
		
//		For petlja
		for(int brojac = 0; brojac <= broj; brojac++) {
			System.out.println(brojac);
		}
//		while petlja
		int brojac = 0;
		while(brojac <= broj) {
			System.out.println(brojac);
			brojac++;
		}
	}
	public static void main(String[] args) {
//		prvaVezba();
//		drugaVezba();
		trecaVezba();
		// TODO Auto-generated method stub

	}

}
