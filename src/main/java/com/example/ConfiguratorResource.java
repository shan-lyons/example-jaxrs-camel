package com.example;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/example")
public class ConfiguratorResource {

	@GET
	@Path("/")
	public String ping() {
		return "This string is set in Configurator Resource at " + new Date().toString();
	}
}
