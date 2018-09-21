package com.company.Java;

import java.util.HashMap;

public class MapEx5 {
    public HashMap<String,String> modifyMap(HashMap<String,String> map){
        if(!map.containsKey("val1"))
            return map;
        if(map.get("val1")!=null)
        {
            map.put("val2",map.get("val1"));
            map.put("val1"," ");
        }
        return map;
    }
}
