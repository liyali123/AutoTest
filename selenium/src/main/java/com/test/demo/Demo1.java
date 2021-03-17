package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public WebDriver driver;
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        WebElement element = driver.findElement(By.id("kw"));
        element.sendKeys("java");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element.clear();
        element.sendKeys("selenium");
        element.submit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.initDriver();

    }
}
