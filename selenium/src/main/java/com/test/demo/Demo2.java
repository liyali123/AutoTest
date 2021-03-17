package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {
    //定义全局变量
    public WebDriver driver;

    //初始化
    @BeforeClass
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    //测试方法
    @Test
    public void justRun(){
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("js-signin-btn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.name("email")).sendKeys("17837625032");
        driver.findElement((By.name("password"))).sendKeys("liyali123456");
        driver.findElement(By.className("moco-btn")).click();
        String title = driver.getTitle();
        System.out.printf(title);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //关闭资源
    @AfterClass
    public void over(){
       driver.close();
    }
}
