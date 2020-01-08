package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.ExcelReader;

import utility.screeshotCapture;

public class baseclass  {

	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	public ExtentTest logger;
	public static Properties prop;
public static WebDriver driver;


	
	@BeforeSuite
	public void openBrowser() {
		

		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromDriverPath"));
		
		 driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("URL"));
			
		}
	
	@DataProvider(name = "mydata")
	public Object[][] getdata() {
		
		ExcelReader ex = new ExcelReader();
		return ex.readExcelSheet(prop.getProperty("Sheetpath"));
	}
	
	public baseclass() throws IOException {
		
	 prop = new Properties ();
		
	
		FileInputStream propfile = new FileInputStream("C:\\Users\\Deep\\eclipse-workspace\\actual\\src\\main\\java\\propertiesPackage\\propertiesfile.properties");
	
			prop.load(propfile);
	
		
	
	}
	

	


	
}
