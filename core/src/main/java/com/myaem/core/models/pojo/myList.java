package com.myaem.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.Date;
@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class myList {


    @ValueMapValue
    public String selected;
    @ValueMapValue
    public String buttonLinkTo;
    @ValueMapValue
    public String someText;
    @ValueMapValue
    public String searchPath;
    @ValueMapValue
    public Date datepicker;

    public String getSelected () {
        return selected;
    }

    public void setSelected ( String selected ) {
        this.selected = selected;
    }

    public String getButtonLinkTo () {
        return buttonLinkTo;
    }

    public void setButtonLinkTo ( String buttonLinkTo ) {
        this.buttonLinkTo = buttonLinkTo;
    }

    public String getSomeText () {
        return someText;
    }

    public void setSomeText ( String someText ) {
        this.someText = someText;
    }

    public String getSearchPath () {
        return searchPath;
    }

    public void setSearchPath ( String searchPath ) {
        this.searchPath = searchPath;
    }

    public Date getDatepicker () {
        return datepicker;
    }

    public void setDatepicker ( Date datepicker ) {
        this.datepicker = datepicker;
    }


}
