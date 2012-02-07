package com.example;

import java.io.InputStream;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.example.cxf.model.Trimline;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 * Defines routes for Configurator Product Data.
 *
 * @author shan.lyons
 *
 */
public class ConfiguratorRouter extends RouteBuilder {
    private static final String AUTH_PARAMS = "authMethod=Basic&authUsername=sfaudidev&authPassword=qwerm,./!";
    private static final String DATA_URI = "http://staging.models.audicatalyst.com"
            + "/services/carlines/a7/configurator.json"
            + "?bridgeEndpoint=true&throwExceptionOnFailure=false&" + AUTH_PARAMS;

    @Override
    public void configure() throws Exception {
        from("cxfrs:bean:rsServer")
            .setHeader(Exchange.HTTP_PATH, constant(""))
            // There must be a better way to do prevent the conversion error than
            // setting the body to empty before the data request...
            .setBody(constant(""))
            .to(DATA_URI)
            .unmarshal().gzip()
            .unmarshal().json(JsonLibrary.Jackson, Trimline[].class)
            .process(new ProductDataProcessor())
            .marshal().json(JsonLibrary.Jackson, InputStream.class);
    }
}
