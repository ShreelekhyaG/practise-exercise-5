package com.company.Java;

import java.util.ArrayList;

public class ArrayList1 {
    public ArrayList<String> update(ArrayList<String> arrayList,String[] element,String[] newElement){
        if(element==null)
            return arrayList;
        for(int index=0;index<element.length;index++){
            if(arrayList.contains(element[index])){
                int indexToReplace=arrayList.indexOf(element[index]);
                arrayList.remove(indexToReplace);
                arrayList.add(indexToReplace,newElement[index]);
            }
        }
        return arrayList;
    }
    public ArrayList<String> empty(ArrayList<String> arrayList){
        arrayList.clear();
        return arrayList;
    }
}
