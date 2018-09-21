package com.company.Java;

import java.util.HashMap;
import java.util.Map;

public class MapArray3 {
    public Map<String,Boolean> findResult(String[] strings){
        Map<String,Boolean> map=new HashMap<>();
        for(String string:strings){
            if(map.containsKey(string)){
                map.put(string,true);
            }
            else{
                map.put(string,false);
            }
        }
        return map;
    }
}
