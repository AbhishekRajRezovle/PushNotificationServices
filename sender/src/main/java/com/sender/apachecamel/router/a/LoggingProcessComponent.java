package com.sender.apachecamel.router.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingProcessComponent {
	
	private Logger logger = LoggerFactory.getLogger(LoggingProcessComponent.class);
	
	public void process(String message) {
		logger.info("LoggingProcessComponent {}",message);
	}

}
