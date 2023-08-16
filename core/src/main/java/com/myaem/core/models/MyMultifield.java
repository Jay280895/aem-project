package com.myaem.core.models;

import com.myaem.core.models.pojo.myList;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyMultifield {
    @ChildResource
    private List<myList> items;

    public List<myList> getItems () {
        return items;
    }
}
