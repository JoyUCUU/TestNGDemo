package com.course.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTes {

    @Test
    @Parameters({"name","age"})
    public void parameters1(String name,int age){
        System.out.println("name:  "+name + ";  age:"+age);
    }
}
