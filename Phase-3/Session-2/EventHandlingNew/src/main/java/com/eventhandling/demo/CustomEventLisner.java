package com.eventhandling.demo;

import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;

public class CustomEventLisner implements ApplicationListener<CustomEvent> {

	public void onApplicationEvent(CustomEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.toString());
	}

}
