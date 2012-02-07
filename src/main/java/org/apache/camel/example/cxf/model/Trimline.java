package org.apache.camel.example.cxf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Represents the Product Data domain concept of a Trimline.
 *
 * @version
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trimline {

    private String price;
    private String title;
    @JsonProperty("default_wheels")
    private String defaultWheels;
    private String defaultExteriorColor;
    private String longTitle;
    private Package[] packages;
//    private Option[] featuredOptions;
    private Wheel[] wheels;
    private int id;
    private String baseImgDir;
    private String defaultInteriorColor;
    private String description;
//    private ExteriorColor[] exteriorColors;
//    private InteriorColor[] interiorColors;
    private Accessory[] accessories;
    private String carline;
    private Option[] options;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDefaultWheels() {
        return defaultWheels;
    }

    public void setDefaultWheels(final String defaultWheels) {
        this.defaultWheels = defaultWheels;
    }

    public String getDefaultExteriorColor() {
        return defaultExteriorColor;
    }

    public void setDefaultExteriorColor(final String defaultExteriorColor) {
        this.defaultExteriorColor = defaultExteriorColor;
    }

    public String getLongTitle() {
        return longTitle;
    }

    public void setLongTitle(final String longTitle) {
        this.longTitle = longTitle;
    }

    public Package[] getPackages() {
        return packages;
    }

    public void setPackages(final Package[] packages) {
        this.packages = packages;
    }
//
//    public Option[] getFeaturedOptions() {
//        return featuredOptions;
//    }
//
//    public void setFeaturedOptions(final Option[] featuredOptions) {
//        this.featuredOptions = featuredOptions;
//    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(final Wheel[] wheels) {
        this.wheels = wheels;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getBaseImgDir() {
        return baseImgDir;
    }

    public void setBaseImgDir(final String baseImgDir) {
        this.baseImgDir = baseImgDir;
    }

    public String getDefaultInteriorColor() {
        return defaultInteriorColor;
    }

    public void setDefaultInteriorColor(final String defaultInteriorColor) {
        this.defaultInteriorColor = defaultInteriorColor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

//    public ExteriorColor[] getExteriorColors() {
//        return exteriorColors;
//    }
//
//    public void setExteriorColors(final ExteriorColor[] exteriorColors) {
//        this.exteriorColors = exteriorColors;
//    }
//
//    public InteriorColor[] getInteriorColors() {
//        return interiorColors;
//    }
//
//    public void setInteriorColors(final InteriorColor[] interiorColors) {
//        this.interiorColors = interiorColors;
//    }
//
    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(final Accessory[] accessories) {
        this.accessories = accessories;
    }

    public String getCarline() {
        return carline;
    }

    public void setCarline(final String carline) {
        this.carline = carline;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(final Option[] options) {
        this.options = options;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(final String price) {
        this.price = price;
    }
}
