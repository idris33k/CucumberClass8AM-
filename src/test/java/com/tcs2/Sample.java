package com.tcs2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
@Test
public void tc4() {
	WebDriverManager.chromedriver().setup();
	WebDriver	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement u = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	u.click();
	u.sendKeys("iphone 11",Keys.ENTER);
//	WebElement p = driver.findElement(By.id("pass"));
//	p.sendKeys("123@i");
//	p.submit();
	driver.quit();
	System.out.println("tc4:    "+Thread.currentThread().getId());
	}


}
