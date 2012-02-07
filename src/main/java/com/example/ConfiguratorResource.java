package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.camel.example.cxf.model.Target;

/**
 * This is a dummy class for JAXRS routing.
 *
 * @author shan.lyons
 *
 */
@Path("/example-jaxrs-camel")
public class ConfiguratorResource {

    @GET
    @Path("/product_data")
    @Produces("application/json")
    public Target getProductData() {
        return null;
    }
}
