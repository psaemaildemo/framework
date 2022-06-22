package com.salesforce.test;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.salesforce.base.ExcelReader;
import com.salesforce.pageobjects.ContactPageObject;

public class ContactTest {
	
	@Test(dataProvider = "testData")
	public void loginTestCase(Object firstName, Object lastName, Object email) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 3.14 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/contact/contactme/?d=cta-header-9");
		ContactPageObject pageObject  = new ContactPageObject(driver);
		pageObject.findfirstName().sendKeys(firstName.toString());
		pageObject.findlastName().sendKeys(lastName.toString());
		pageObject.findEmail().sendKeys(email.toString());
		driver.close();
	}

	@DataProvider
	public Object[][] testData(){
		ArrayList data = ExcelReader.getData("D:\\contacttestdata.xlsx");
		System.out.println(data.size());
		int row = data.size()/3;
		int col = 3;
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
