package com.salesforce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPageObject {
	private WebDriver driver;
	
	public ContactPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By firstName = By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[1]/div/div/input");
	By lastName = By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/input");
	By email = By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[3]/div/input");
	
	public WebElement findfirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement findlastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement findEmail() {
		return driver.findElement(email);
	}
	
}
