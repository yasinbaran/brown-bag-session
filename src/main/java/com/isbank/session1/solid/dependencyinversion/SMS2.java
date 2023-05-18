package com.isbank.session1.solid.dependencyinversion;

public class SMS2 implements Message {

	@Override
	public void sendMessage() {
		sendSMS();
	}

	private void sendSMS() {
		// Send sms
	}
}
