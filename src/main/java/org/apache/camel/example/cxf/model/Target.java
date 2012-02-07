package org.apache.camel.example.cxf.model;

/**
 * Represents the Configurator domain concept of a Target.
 *
 * @version
 */
public class Target {
    private String id;
    private String collection;

    public String getId() {
        return id;
    }
    public void setId(final String id) {
        this.id = id;
    }
    public String getCollection() {
        return collection;
    }
    public void setCollection(final String collection) {
        this.collection = collection;
    }
}
