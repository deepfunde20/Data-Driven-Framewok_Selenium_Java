package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import basePackage.baseclass;

public class screeshotCapture extends baseclass {

	
	public screeshotCapture() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public  String failed(WebDriver driver, String methodname)  {
		
	
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
	
		String screenshotpath = "C:\\Users\\Deep\\eclipse-workspace\\actual\\Screenshot_Failed\\fail_"+methodname +".jpg";
		File ScrFile=ts.getScreenshotAs(OutputType.FILE);
		
	try {
		FileUtils.copyFile(ScrFile, new File ("C:\\Users\\Deep\\eclipse-workspace\\actual\\Screenshot_Failed\\fail_"+methodname +".jpg"));
		
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
		
		return screenshotpath;
	}
}
