package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class MyFrstComp {
    @ValueMapValue
    @Optional
    private String myFrstComp;
    @ValueMapValue
    @Optional
    private String searchPath;

    public void setSearchPath ( String searchPath ) {
        this.searchPath = searchPath;
    }

    public String getMyFrstComp () {
        return myFrstComp;
    }
}