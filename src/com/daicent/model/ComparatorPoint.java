package com.daicent.model;

import java.util.Comparator;

public class ComparatorPoint implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
       if(o1.getPoint()>o2.getPoint()){
           return -1;
       } else if (o1.getPoint()<o2.getPoint()) {
           return 1;
       }else {
           return 0;
       }
    }
}
