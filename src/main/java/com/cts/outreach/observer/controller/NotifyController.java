package com.cts.outreach.observer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotifyController {
	
	private final SimpMessagingTemplate template;
	
	@Autowired
	NotifyController(SimpMessagingTemplate template) {
		this.template = template;
	}
	
	@MessageMapping("/notifyUsers")
	public void onReceived(String message) {
		this.template.convertAndSend("/notify", message);
	}

}
