package org.apache.camel.example.cxf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Represents the Product Data domain concept of a Message.
 *
 * @version
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    private String generic;
    private String specific;

    public String getGeneric() {
        return generic;
    }
    public void setGeneric(final String generic) {
        this.generic = generic;
    }
    public String getSpecific() {
        return specific;
    }
    public void setSpecific(final String specific) {
        this.specific = specific;
    }
}
