package com.salesforce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	private WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By userName = By.xpath("//*[@id='username']");
	By password = By.xpath("//*[@id='password']");
	By loginButton = By.xpath("//*[@id='Login']");
	
	public WebElement findUserName() {
		return driver.findElement(userName);
	}
	
	public WebElement findPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	
}
