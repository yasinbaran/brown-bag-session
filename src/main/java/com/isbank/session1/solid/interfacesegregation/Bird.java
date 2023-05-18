package com.isbank.session1.solid.interfacesegregation;

public class Bird implements Animal {

	@Override
	public void fly() {
		System.out.println("Uçan kuş");
	}

	@Override
	public void run() {
		System.out.println("Koşan kuş");
	}

	@Override
	public void bark() {
		// kuşlar havlamaz boşa implement etmiş olduk.
	}

}
