package com.stackoverflow;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTask {
    @Test
    public void secondTest() {
        System.setProperty("webdriver.chrome.driver", "D:/rex/src/main/resources/chromedriver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/demos/");
        driver.manage().window().maximize();
        WebElement Spinner = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[12]/a"));
        Spinner.click();
        driver.switchTo().frame(0);
        WebElement SearchInput = driver.findElement(By.xpath("//input[@id='spinner']"));
        SearchInput.sendKeys("20");
        WebElement GetValue = driver.findElement(By.xpath("//*[@id=\"getvalue\"]"));
        GetValue.click();
        driver.switchTo().alert().getText();
        System.out.println("Alert text is: " + driver.switchTo().alert().getText());
        driver.quit();
    }
}
