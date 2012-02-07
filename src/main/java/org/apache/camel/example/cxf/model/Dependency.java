package org.apache.camel.example.cxf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Represents the Configurator domain concept of a Dependency.
 *
 * @version
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dependency {
    // Contrary to convention, this singular object is called Messages in JSON
    private Message messages;
    private String action;
    private Target target;

    public Message getMessages() {
        return messages;
    }
    public void setMessages(final Message messages) {
        this.messages = messages;
    }
    public String getAction() {
        return action;
    }
    public void setAction(final String action) {
        this.action = action;
    }
    public Target getTarget() {
        return target;
    }
    public void setTarget(final Target target) {
        this.target = target;
    }
}
