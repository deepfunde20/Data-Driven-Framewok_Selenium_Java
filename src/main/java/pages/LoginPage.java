package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import basePackage.baseclass;
import listeners.ExtentReportListener;
import utility.ExcelReader;


public class LoginPage extends baseclass {


	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@DataProvider(name = "LoginData")
	public Object [][] ExtractData() {
		
		
		ExcelReader ex = new ExcelReader();
	Object [][] oj =	ex.readExcelSheet(prop.getProperty("Sheetpath"));
		
		return oj;
	}
	

	public void LoginTest(String UserName, String PassWord) {
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.RETURN);
		
	boolean value=	driver.findElement(By.xpath("//div[@class='quickLaunge']")).isDisplayed();
	
	Assert.assertEquals(value, true);

	}
	
	
	

	
}
