package com.myaem.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.Date;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogsLists {
    @ValueMapValue
    private String teaserImage;

    @ValueMapValue
    private String teaserHeading;

    @ValueMapValue
    private String postContent;

    @ValueMapValue
    private String postLinkTo;

    @ValueMapValue
    private String postTitle;

    @ValueMapValue
    private Date datePicker;

    public String getTeaserImage() {
        return teaserImage;
    }

    public void setTeaserImage(String teaserImage) {
        this.teaserImage = teaserImage;
    }

    public String getTeaserHeading() {
        return teaserHeading;
    }

    public void setTeaserHeading(String teaserHeading) {
        this.teaserHeading = teaserHeading;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostLinkTo() {
        return postLinkTo;
    }

    public void setPostLinkTo(String postLinkTo) {
        this.postLinkTo = postLinkTo;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public Date getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(Date datePicker) {
        this.datePicker = datePicker;
    }
}
