package com.company.Test;

import com.company.Java.MapFrequency2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapFrequency2Test {
    MapFrequency2 mapFrequency2;
    @Before
    public void setUp() throws Exception {
        mapFrequency2=new MapFrequency2();
    }

    @After
    public void tearDown() throws Exception {
        mapFrequency2=null;
    }

    @Test
    public void findFrequency() {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);
        assertEquals("failed", map,mapFrequency2.findFrequency("one one -one___two,,three,one @three*one?two") );
        Map<String,Integer> map2=new HashMap<>();
        map2.put("the",2);
        map2.put("quick",1);
        map2.put("brown",2);
        map2.put("fox",3);
        map2.put("jumps",1);
        map2.put("over",1);
        map2.put("lazy",1);
        map2.put("dog",1);
        assertEquals("failed", map2, mapFrequency2.findFrequency("the quick brown fox jumps fox fox over the lazy dog brown"));
    }
    @Test
    public void findFrequencyFailure(){
        assertNotNull(mapFrequency2.findFrequency(""));
        assertNull(mapFrequency2.findFrequency(null));
    }
}