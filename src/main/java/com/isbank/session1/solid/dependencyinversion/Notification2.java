package com.isbank.session1.solid.dependencyinversion;

import java.util.List;

public class Notification2 {
	private List<Message> messages;

	public Notification2(List<Message> messages) {
		this.messages = messages;
	}

	public void sender() {
		for (Message message : messages) {
			message.sendMessage();
		}
	}
}
