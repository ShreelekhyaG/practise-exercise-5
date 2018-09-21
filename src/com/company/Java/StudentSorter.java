package com.company.Java;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()!=o2.getAge())
            return o2.getAge()-o1.getAge();
        if(o1.getName()!=o2.getName())
            return o2.getName().compareTo(o1.getName());
        return o2.getId()-o1.getId();
    }
}
