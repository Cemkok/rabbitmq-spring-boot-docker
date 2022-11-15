package com.youtube.springbootrabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.youtube.springbootrabbitmq.model.Notification;
@Service
public class NotificationListener {
	
	@RabbitListener(queues="cem-queue")
	public void handleMessage(Notification notification) {
		
		System.out.println("Message received...");
		System.out.println(notification.toString());
	}

}
