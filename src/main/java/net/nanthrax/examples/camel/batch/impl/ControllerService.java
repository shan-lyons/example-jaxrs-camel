package net.nanthrax.examples.camel.batch.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
* REST service implementation of the Camel batch service.
*/
@Path("/")
public class ControllerService {

  @GET
  @Path("/start")
  @Produces("text/plain")
  public String startRoute() throws Exception {
    // nothing to do, it's just a wrapper
    return null;
  }

}