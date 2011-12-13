package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;

@Path("/example")
public class ConfiguratorResource {

	private static final Logger LOGGER = Logger.getLogger(ConfiguratorResource.class);

	@GET
	@Path("/")
	public String ping() {
		LOGGER.debug("Inside ConfiguratorResource.ping()");
		return "SUCCESS";
	}
}
