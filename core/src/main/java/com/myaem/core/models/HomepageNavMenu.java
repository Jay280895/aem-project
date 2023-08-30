package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomepageNavMenu {
    @ValueMapValue
    private String linkA;
    @ValueMapValue
    private String contentFirst;
    @ValueMapValue
    private String linkB;
    @ValueMapValue
    private String contentSecond;

    public String getLinkA () {
        return linkA;
    }

    public String getContentFirst () {
        return contentFirst;
    }

    public String getLinkB () {
        return linkB;
    }

    public String getContentSecond () {
        return contentSecond;
    }


}
