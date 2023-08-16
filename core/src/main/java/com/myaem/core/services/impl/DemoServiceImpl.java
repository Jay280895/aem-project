package com.myaem.core.services.impl;

import com.myaem.core.services.DemoService;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(service = DemoService.class,immediate = true)
@Designate (ocd = DemoServiceImpl.CAConfig.class)
public class DemoServiceImpl implements DemoService {
   String demoUrl= StringUtils.EMPTY;
    String name= StringUtils.EMPTY;

    @ObjectClassDefinition(name = "DemoUrl for testing",description = "Enter the Url obj des")
    @interface CAConfig{
        @AttributeDefinition (name = "DemoUrl",description = "Enter the Url",type = AttributeType.STRING)
        String getUrl();
        @AttributeDefinition (name = "DemoName",description = "Enter the Name",type = AttributeType.STRING)
        String getName();
    }
    @Activate
    @Modified
    protected void activate(DemoServiceImpl.CAConfig props){
        demoUrl=props.getUrl();
        name= props.getName ();
    }

    @Override
    public String getUrl() {
        return demoUrl;
    }
    @Override
    public String getName() {
        return demoUrl;
    }
}
