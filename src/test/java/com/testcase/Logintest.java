package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\Desktop\\Sellenium\\Offline Website\\index.html");
		driver.manage().window().maximize();
	}
@Test
public void test01()
{
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("HEHEHEHEHEHEHEHEHEHEHEHEHEHHE========================");
}
@Test
public void test02()
{
	String title=driver.getTitle();
	Assert.assertEquals("JavaByKiran | Dashboard", title);
}
}
