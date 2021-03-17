package com.course.testng.suite;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class PayTest {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[]{PayTest.class});
        testng.run();
    }

    @Test
    public  void paySuccess(){
        System.out.println("支付宝支付成功");
    }
}
