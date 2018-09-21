package com.company.Test;

import com.company.Java.MapEx5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapEx5Test {
    MapEx5 mapEx5;
    @Before
    public void setUp() throws Exception {
        mapEx5=new MapEx5();
    }

    @After
    public void tearDown() throws Exception {
        mapEx5=null;
    }

    @Test
    public void modifyMap() {
        HashMap<String,String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","mars");
        HashMap<String,String> map2=new HashMap<>();
        map2.put("val1"," ");
        map2.put("val2","java");
        assertEquals(map,mapEx5.modifyMap(map));
        map.remove("val1");
        assertEquals(map,mapEx5.modifyMap(map));
    }
}