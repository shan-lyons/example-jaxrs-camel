package org.apache.camel.example.cxf.model;

/**
 * Represents the Product Data domain concept of a Model (or generic vehicle).
 *
 * @version
 */
public class Model {

    private Trimline[] trimlines;

    public Model(final Trimline[] trimlines) {
        this.trimlines = trimlines;
    }

    public Model() {
        this.trimlines = null;
    }

    public Trimline[] getTrimines() {
        return trimlines;
    }

    public void setTrimlines(final Trimline[] trimlines) {
        this.trimlines = trimlines;
    }
}
