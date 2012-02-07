package org.apache.camel.example.cxf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Represents the Product Data domain concept of an Accessory.
 *
 * This class has the same properties as Option!!
 *
 * @version
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accessory {
    private String price;
    private Dependency[] dependencies;
    private String title;
    private String optionCode;
    private String id;
    private String content;
    private String thumbnailURL;
    private String[] additionalAssets;
    private String disclaimerText;

    public String getPrice() {
        return price;
    }
    public void setPrice(final String price) {
        this.price = price;
    }
    public Dependency[] getDependencies() {
        return dependencies;
    }
    public void setDependencies(final Dependency[] dependencies) {
        this.dependencies = dependencies;
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
    public String[] getAdditionalAssets() {
        return additionalAssets;
    }
    public void setAdditionalAssets(final String[] additionalAssets) {
        this.additionalAssets = additionalAssets;
    }
    public String getDisclaimerText() {
        return disclaimerText;
    }
    public void setDisclaimerText(final String disclaimerText) {
        this.disclaimerText = disclaimerText;
    }

}
