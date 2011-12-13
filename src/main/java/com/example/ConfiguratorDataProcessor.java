package com.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class ConfiguratorDataProcessor implements Processor {

	private static final Logger LOGGER = Logger.getLogger(ConfiguratorDataProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		Object body = exchange.getIn().getBody();
		LOGGER.debug(body.getClass());
		LOGGER.debug(body);
	}
}
