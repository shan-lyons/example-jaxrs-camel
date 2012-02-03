package net.nanthrax.examples.camel.batch.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.Handler;

/**
* Camel controller bean involved in the starting routed
*/
public class ControllerBean {

  private String routeId;

  public String getRouteId() {
    return this.routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  @Handler
  public String startRoute(CamelContext camelContext) throws Exception {
    camelContext.startRoute(routeId);
    return "Batch " + routeId + " started.";
  }

}