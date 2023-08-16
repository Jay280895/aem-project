package com.myaem.core.models.multifieldoutput;

import com.adobe.xfa.ut.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class dataList {


    @ValueMapValue
    private String cellValue;

    public String getCellValue () {
        return cellValue;
    }
   /* List<Integer> newlist = new ArrayList<> ();
    public List<Integer> getTableList() {
        if ( !StringUtils.isEmpty ( cellValue ) ) {
            int val = Integer.parseInt ( cellValue );
            for (int i = 1; i < 11; i++) {
                newlist.add ( val * i );
            }
        }
        return newlist;
    }*/
}
