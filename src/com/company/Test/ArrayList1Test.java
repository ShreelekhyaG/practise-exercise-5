package com.company.Test;

import com.company.Java.ArrayList1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayList1Test {
    ArrayList1 arrayList1;
    @Before
    public void setUp() throws Exception {
        arrayList1=new ArrayList1();
    }

    @After
    public void tearDown() throws Exception {
        arrayList1=null;
    }

    @Test
    public void update() {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("kiwi");
        arrayList.add("grape");
        arrayList.add("mango");
        arrayList.add("berry");
        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("apple");
        arrayList2.add("grape");
        arrayList2.add("melon");
        arrayList2.add("berry");
        assertEquals(arrayList,arrayList1.update(arrayList2,new String[]{"apple","melon"},new String[]{"kiwi","mango"}));
        assertEquals(arrayList2,arrayList1.update(arrayList2,null,null));
    }

    @Test
    public void empty() {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("kiwi");
        arrayList.add("grape");
        arrayList.add("mango");
        arrayList.add("berry");
        ArrayList<String> arrayList2=new ArrayList<>();
        assertEquals(arrayList2,arrayList1.empty(arrayList));
        ArrayList<String> arrayList3=new ArrayList<>();
        assertEquals(arrayList3,arrayList1.empty(arrayList3));
    }
}