package com.course.testng.suite;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public  void testCase1(){

        System.out.println("这是测试用例1");
    }

    /***
     * 当光标停留在testCase2时，右键点击可以单独运行该测试用例
     */
    @Test
    public  void testCase2(){
        System.out.println("这是测试用例2");
    }
        @BeforeMethod
    public void  beforeMethod(){
        System.out.println("BeforeMethod 这是在测试方法之前运行的");
    }

    /**
     * 测试方法之后运行的
     */
    @AfterMethod
    public  void  afterMethod(){
        System.out.println("AfterMethod 这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass 这是在测试类之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 这是在测试类之后运行的");
    }

    @BeforeSuite
    public  void beforeSuit(){
        System.out.println("beforeSuit 这是在测试套件");
    }

    @AfterSuite
    public  void afterSuie(){
        System.out.println("afterSuit 这是测试套件");
    }
}
