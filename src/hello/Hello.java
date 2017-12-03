package hello;

import wersja_alternatywna.samochod;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Pierwsza wersja");
		System.out.println("Druga wersja");
		
		System.out.println("Wersja alternatywna");
		samochod s = new samochod("Toyota", "Corolla", 2017, 160, 125);
		System.out.println(s);
	}

}
