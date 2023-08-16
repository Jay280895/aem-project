package com.myaem.core.services.impl;

import com.myaem.core.services.EmployeeDetails;
import org.apache.commons.lang.StringUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(service = EmployeeDetails.class, immediate = true)
@Designate (ocd = EmployeeDetailsImpl.MyInterface.class)
public class EmployeeDetailsImpl implements EmployeeDetails{

    String empNameIs = StringUtils.EMPTY;
    String empAddressIs= StringUtils.EMPTY;
    int empIDIs = 0;
    @ObjectClassDefinition(name = "Employee Details",description = " For Employees only")
    @interface MyInterface{
        @AttributeDefinition(name = " Enter Emp. id",description = "Only Emp id", type = AttributeType.INTEGER)
        int empId();
        @AttributeDefinition(name = " Enter Emp. name",description = "Only Emp names", type = AttributeType.STRING)
        String empName();

        @AttributeDefinition(name = " Enter Emp. address",description = "Only Emp address", type = AttributeType.STRING)
        String empAddress();

    }

    @Activate
    @Modified
    private void onActive(EmployeeDetailsImpl.MyInterface prop){
       empIDIs= prop.empId ();
       empNameIs=prop.empName ();
       empAddressIs=prop.empAddress ();

    }

    @Override
    public String empName () {
        return empNameIs;
    }

    @Override
    public int empID () {
        return empIDIs;
    }
    @Override
    public String empAddress () {
        return empAddressIs;
    }
}
