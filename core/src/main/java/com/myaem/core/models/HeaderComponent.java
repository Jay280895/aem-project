package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponent {
    @ValueMapValue
    private String file;

    @ValueMapValue
    private String inputHeaderText;

    public String getFile () {
        return file;
    }

    public String getInputHeaderText () {
        return inputHeaderText;
    }

    public String getAlt () {
        return alt;
    }

    @ValueMapValue
    private String alt;

}
