package com.myaem.core.services.impl;

import com.myaem.core.services.CompanyDetails;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(service = CompanyDetails.class,immediate = true)
@Designate (ocd = CompanyDetailsImpl.ComPDetails.class)
public class CompanyDetailsImpl implements CompanyDetails {
String cName= StringUtils.EMPTY;
String[] cAddress=StringUtils.split (  "");
char cTmark= CharUtils.NUL;

@ObjectClassDefinition(name = " Company Details",description = "Enter your Company Details")
    @interface ComPDetails{
        @AttributeDefinition(name = "Company name", description=" Enter Company Name", type = AttributeType.STRING)
        String companyName();
        @AttributeDefinition(name = "Company Address", description=" Enter Company Address", type = AttributeType.STRING)
        String[] companyAddress();
        @AttributeDefinition(name = "Company Trade Mark", description=" Enter Company Trade Mark", type = AttributeType.CHARACTER)
        char companyTMark();
    }

//    @Activate
//    @Modified
//    private void onActive(CompanyDetails.){
//     cName =
//    }
    @Override
    public String companyName () {
        return null;
    }

    @Override
    public String companyAddress () {
        return null;
    }

    @Override
    public char companyTMark () {
        return 0;
    }
}
