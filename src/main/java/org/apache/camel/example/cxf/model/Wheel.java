package org.apache.camel.example.cxf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Represents the Product Data domain concept of a Wheel.
 *
 * @version
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wheel {
    private Dependency[] dependencies;
    private String price;
    private String layerPath;
    private String title;
    private String optionCode;
    private String id;
    private String content;
    private String thumbnailURL;

    public Dependency[] getDependencies() {
        return dependencies;
    }
    public void setDependencies(final Dependency[] dependencies) {
        this.dependencies = dependencies;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(final String price) {
        this.price = price;
    }
    public String getLayerPath() {
        return layerPath;
    }
    public void setLayerPath(final String layerPath) {
        this.layerPath = layerPath;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(final String title) {
        this.title = title;
    }
    public String getOptionCode() {
        return optionCode;
    }
    public void setOptionCode(final String optionCode) {
        this.optionCode = optionCode;
    }
    public String getId() {
        return id;
    }
    public void setId(final String id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(final String content) {
        this.content = content;
    }
    public String getThumbnailURL() {
        return thumbnailURL;
    }
    public void setThumbnailURL(final String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }
}
