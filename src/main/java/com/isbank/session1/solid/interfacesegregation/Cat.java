package com.isbank.session1.solid.interfacesegregation;

public class Cat implements Animal {

	@Override
	public void fly() {
		// kediler uçamaz boşa implement etmiş olduk.

	}

	@Override
	public void run() {
		System.out.println("Koşan kedi");

	}

	@Override
	public void bark() {
		// kediler havlamaz boşa implement etmiş olduk.

	}

}
