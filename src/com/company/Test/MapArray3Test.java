package com.company.Test;

import com.company.Java.MapArray3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapArray3Test {
    MapArray3 mapArray3;
    @Before
    public void setUp() throws Exception {
        mapArray3=new MapArray3();
    }

    @After
    public void tearDown() throws Exception {
        mapArray3=null;
    }

    @Test
    public void findResult() {
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);map.put("b",false);
        map.put("c",true);map.put("d",false);
        assertEquals(map,mapArray3.findResult(new String[]{"a","b","c","d","a","c","c"}));
    }
    @Test
    public void findResultFailure(){
        assertNotNull(mapArray3.findResult(new String[]{"a"}));
    }
}