package com.isbank.session1.solid.interfacesegregation;

public class Bird implements Flyable, Runnable {

	@Override
	public void run() {
		System.out.println("Kuş,Koşuyorum");

	}

	@Override
	public void fly() {
		System.out.println("Kuş, Uçuyorum.");

	}

}
