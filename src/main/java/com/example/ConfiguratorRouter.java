package com.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class ConfiguratorRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxfrs:bean:rsServer")
			.process(new Processor() {
			    @Override
                public void process(Exchange exchange) {
			        exchange.getIn();
			    }
			});
	}
}
