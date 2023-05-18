package com.isbank.session1.solid.dependencyinversion;

public class Notification {
	private Email email = new Email();
	private SMS sms = new SMS();

	public void sender() {

		email.sendEmail();
		sms.sendSMS();
	}

	// Notification üst seviye sınıf ama Email ve SMS alt sınıflarına bağlı. 
	//SMS ve Emailde değişimleri direkt Notification'ı etkiler.
}
