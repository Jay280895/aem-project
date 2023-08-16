package com.myaem.core.models;

import com.adobe.xfa.ut.StringUtils;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.drew.lang.StringUtil;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(adaptables = Resource.class)
public class MyNumber {

    @ValueMapValue
    @Optional
    private String myNumber;

    //    List<Integer> myList = new ArrayList<> ();
    Map<Integer,Integer> myMap = new HashMap<> ();
    @PostConstruct
    protected void init() {
        if (!StringUtils.isEmpty (myNumber)){
            int val = Integer.parseInt (myNumber);
        for (int i = 1; i < 11; i++) {
            myMap.put(i, val * i );
        }
    }
    }
//    public List<Integer> getMyList () {
//        return myList;
//    }
public Map<Integer, Integer> getMyMap () {
    return myMap;
}
}
