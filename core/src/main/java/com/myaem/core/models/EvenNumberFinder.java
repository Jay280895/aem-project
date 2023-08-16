package com.myaem.core.models;

import com.adobe.xfa.ut.StringUtils;
import com.myaem.core.services.DemoService;
import com.myaem.core.services.EmployeeDetails;
import com.myaem.core.services.impl.DemoServiceImpl;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class EvenNumberFinder {

    @Inject
    EmployeeDetails empS;
    @Inject
    DemoServiceImpl newObj;
    @ValueMapValue
    @Named(value="inputNum")
//    @Default(values="12")
//   @Default
    private String zeeshan;
@OSGiService
DemoService demo;


    @PostConstruct
    protected void init() {
        if (!StringUtils.isEmpty (zeeshan)) {
            int val = Integer.parseInt ( zeeshan);
            if ( val%2==0 ){
                zeeshan= zeeshan +" is Even Number";
            }
            else {
                zeeshan= zeeshan +" Is Not Even Number";
            }
        }}
    public String getInputNum () {
        return zeeshan+empS.empName()+ "\r\n" +empS.empID ()+"\r\n"+empS.empAddress ()+"\r\n"+newObj.getUrl ()+demo.getUrl ()+demo.getName ();
    }
}
