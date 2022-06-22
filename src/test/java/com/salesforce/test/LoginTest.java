package com.salesforce.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.salesforce.base.ExcelReader;
import com.salesforce.pageobjects.LoginPageObject;

public class LoginTest {
	
	@Test(dataProvider = "testData")
	public void loginTestCase(Object username, Object password) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 3.14 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		LoginPageObject pageObject  = new LoginPageObject(driver);
		pageObject.findUserName().sendKeys(username.toString());
		pageObject.findPassword().sendKeys(password.toString());
		pageObject.getLoginButton().click();
		driver.close();
	}

	@DataProvider
	public Object[][] testData(){
		ArrayList data = ExcelReader.getData("D:\\logintestdata.xlsx");
		System.out.println(data.size());
		int row = data.size()/2;
		int col = 2;
		Object[] a = data.toArray();
		
		Object[][] b = new Object[row][col];
		
		int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               b[i][j]=a[count];
                count++;
            }
        }
        
		
        return b;
	}
	
}
