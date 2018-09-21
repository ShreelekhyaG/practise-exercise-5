package com.company.Java;

import java.util.HashMap;
import java.util.Map;

public class MapFrequency2 {

    public Map<String,Integer> findFrequency(String string){
        if(string==null)
            return null;
        string=string.replaceAll("[\\W|\\_]"," ").trim();
        System.out.println(string);
        String words[]=string.split("\\s+");
        Map<String,Integer> map=new HashMap<>();
        int count;
        for(String word:words){
            if(map.containsKey(word)){
                count=map.get(word);
                count++;
                map.replace(word,count);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println(map.toString());
        return map;
    }
}
