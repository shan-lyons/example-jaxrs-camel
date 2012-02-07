package org.apache.camel.example.cxf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Represents the Product Data domain concept of an Package.
 *
 * @version
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Package {
    private String price;
    private String title;
    private String optionCode;
    private String id;
    private String content;
    private String[] features;
    private String thumbnailUrl;
    private String[] additionalAssets;
    private String disclaimerText;

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

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(final String[] features) {
        this.features = features;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(final String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(final String price) {
        this.price = price;
    }
}
