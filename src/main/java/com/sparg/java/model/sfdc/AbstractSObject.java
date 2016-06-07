package com.sparg.java.model.sfdc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: vimal.sengoden
 * Date: 6/11/2015
 * Time: 5:04 PM
 */
public class AbstractSObject {

    protected String id;

    @JsonIgnore
    public String getId() {
        return id;
    }

    @JsonProperty(value="Id")
    public void setId(final String id) {
        this.id = id;
    }
}
