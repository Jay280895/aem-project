package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class InputValModel {
    @ValueMapValue
    @Optional
    private String inputValue;

    public String getInputValue () {
        return inputValue;
    }
}
