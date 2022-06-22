package com.salesforce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void TestCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 3.14 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/selectbox.html");
		
		WebElement selectItem = driver.findElement(By.xpath("//*[@id='cars']"));
		Select s = new Select(selectItem);
		//s.selectByIndex(2);
		s.selectByValue("mercedes");
	}
}
