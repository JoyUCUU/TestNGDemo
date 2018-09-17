package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tec")
public class GroupsOnClass3 {
    public void tec1(){
        System.out.println("这是class3333中的tec1");
    }
    public void tec2(){
        System.out.println("这是class333中的tec2");
    }
}
