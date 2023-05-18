package com.isbank.session1.solid.interfacesegregation;

public class Bird2 implements Animal {

	@Override
	public void fly() {
		// kuşlar havlamaz boşa implement etmiş olduk.

	}

	@Override
	public void run() {
		System.out.println("Koşan kuş");

	}

	@Override
	public void bark() {
		System.out.println("Uçan kuş");

	}

}
