package com.myaem.core.services.impl;

import com.myaem.core.services.DepartmentDetails;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import java.util.Arrays;

@Component(service = DepartmentDetails.class,immediate = true)
@Designate (ocd = DepartmentDetailsImpl.Department.class)
public class DepartmentDetailsImpl implements DepartmentDetails {

    String departName = StringUtils.EMPTY;
    String departNo= StringUtils.EMPTY;
    int departCode=0;
@ObjectClassDefinition(name = " Department Details", description = " Only Department Details Entry")
@interface Department{
    @AttributeDefinition(name = "Department Name", description = "Enter the department name",type = AttributeType.STRING)
    String[] departmentName();
    @AttributeDefinition(name = "Department Number", description = "Enter the department Number",type = AttributeType.STRING)
    String departNo();
    @AttributeDefinition(name = "Department code", description = "Enter the department Code",type = AttributeType.INTEGER)
    int departmentCode();
}

    @Activate
    @Modified
    private void activeDepartment(DepartmentDetailsImpl.Department myProps){
    departName= Arrays.toString ( myProps.departmentName () );
    departNo= myProps.departNo ();
    departCode=myProps.departmentCode ();
    }
    @Override
    public String departmentName () {
        return departName;
    }

    @Override
    public String departNo () {
        return departNo;
    }

    @Override
    public int departmentCode () {
        return departCode;
    }
}
