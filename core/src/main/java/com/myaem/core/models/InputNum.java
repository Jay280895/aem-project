package com.myaem.core.models;

import com.adobe.xfa.ut.StringUtils;
import com.myaem.core.models.pojo.Myclass;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class InputNum {
    List<Myclass> newNum = new ArrayList<> ();
    @ValueMapValue
    private String inputValue;

    @PostConstruct
    protected void init () {
        if ( !StringUtils.isEmpty ( inputValue ) ) {
            //int[] newNum = new int[10];
            int val = Integer.parseInt ( inputValue );
            for (int i = 1; i < val; i++) {
                inputValue = Integer.toString ( val - 1 );
                Myclass zeeshan = new Myclass ();
                zeeshan.setClasss ( "myclass" + i );
                zeeshan.setName ( "myName" + i );
                zeeshan.setColleage ( "myColleage" + i );
                newNum.add ( zeeshan );
            }

        }
    }

    public List<Myclass> getNewNum () {
        return newNum;
    }

    public String getInputValue () {
        return inputValue;
    }

}
