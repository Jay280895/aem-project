package com.myaem.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterList {

    @ValueMapValue
    private String footerText;

    @ValueMapValue
    private String footerLink;

    public String getFooterText() {
        return footerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getFooterLink() {
        return footerLink;
    }

    public void setFooterLink(String footerLink) {
        this.footerLink = footerLink;
    }
}
