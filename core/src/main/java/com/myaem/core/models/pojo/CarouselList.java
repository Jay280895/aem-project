package com.myaem.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CarouselList {

    @ValueMapValue
    private String carouselImage;

    @ValueMapValue
    private String ctaText;

    @ValueMapValue
    private String ctaLink;

    @ValueMapValue
    private String overlayHeading;

    @ValueMapValue
    private String overlaySubHeading;

    public String getCarouselImage() {
        return carouselImage;
    }

    public void setCarouselImage(String carouselImage) {
        this.carouselImage = carouselImage;
    }

    public String getCtaText() {
        return ctaText;
    }

    public void setCtaText(String ctaText) {
        this.ctaText = ctaText;
    }

    public String getCtaLink() {
        return ctaLink;
    }

    public void setCtaLink(String ctaLink) {
        this.ctaLink = ctaLink;
    }

    public String getOverlayHeading() {
        return overlayHeading;
    }

    public void setOverlayHeading(String overlayHeading) {
        this.overlayHeading = overlayHeading;
    }

    public String getOverlaySubHeading() {
        return overlaySubHeading;
    }

    public void setOverlaySubHeading(String overlaySubHeading) {
        this.overlaySubHeading = overlaySubHeading;
    }
}
