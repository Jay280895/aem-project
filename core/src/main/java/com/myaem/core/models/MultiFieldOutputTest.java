package com.myaem.core.models;

import com.adobe.xfa.ut.StringUtils;
import com.myaem.core.models.multifieldoutput.dataList;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultiFieldOutputTest {
    @ChildResource
    private List<dataList> items;
    List<List<Integer>> tableList = new ArrayList<> ();
    @PostConstruct
    protected void init() {
        if(!items.isEmpty ()){
            for (int i = 0; i < items.size(); i++) {
                tableList.add ( tableList (items.get ( i ).getCellValue ()) );
            }

        }

    }

    private List<Integer>  tableList (String myNumber) {
        List<Integer> myList = new ArrayList<> ();
        if ( !StringUtils.isEmpty ( myNumber ) ){
            int val = Integer.parseInt ( myNumber );
            for (int i = 1; i < 11; i++) {
                myList.add ( val * i );
            }
        }
        return myList;
    }

    public List<dataList> getItems () {
        return items;
    }
    public List<List<Integer>> getTableList () {
        return tableList;
    }
}
