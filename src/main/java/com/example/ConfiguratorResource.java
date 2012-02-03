package com.example;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class ConfiguratorResource {

	@GET
	@Path("/example")
	@Produces("text/plain")
	public String ping() {
		return "This string is set in Configurator Resource at " + new Date().toString();
	}
}
