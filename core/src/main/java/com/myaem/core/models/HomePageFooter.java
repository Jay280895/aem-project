package com.myaem.core.models;

import com.myaem.core.models.pojo.FooterList;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomePageFooter {
    @ChildResource
    private List<FooterList> items;

    public List<FooterList> getItems() {
        return items;
    }
}
