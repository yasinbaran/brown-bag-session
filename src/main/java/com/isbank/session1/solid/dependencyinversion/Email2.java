package com.isbank.session1.solid.dependencyinversion;

public class Email2 implements Message {

	@Override
	public void sendMessage() {
		sendEmail();

	}

	private void sendEmail() {
		// Send email
	}

}
