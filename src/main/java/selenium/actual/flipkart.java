package selenium.actual;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import basePackage.baseclass;
import listeners.CustomListner;



public class flipkart extends baseclass {


	public flipkart() throws IOException  {
		super();
		// TODO Auto-generated constructor stub
	}

	
@Test 
public void check34() {

	ExtentTest logger=extent.createTest("first test");
	logger.fail("tihifgiajgioaiogp");

	Assert.assertEquals(true, false);
}

	
	 
	public void gotoOrange(String user, String password) {
		
		driver.get(prop.getProperty("URL"));
		
		WebElement usef =driver.findElement(By.xpath("//input[@name='txtUsername']"));
		WebElement passf =driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		usef.sendKeys(user);
		passf.sendKeys(password);
		
		passf.submit();
		
		boolean ab=driver.findElement(By.xpath("//canvas[@class='flot-overlay']")).isDisplayed();
		Assert.assertEquals(ab, true);
	}


	

	public void ff() {
		driver.findElement(By.name("q")).sendKeys("this is what i want");
		
		Assert.assertEquals(true, false);
	
	}
	
	
}
