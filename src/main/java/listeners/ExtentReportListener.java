package listeners;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import basePackage.baseclass;

public class ExtentReportListener extends TestngListnerAdapter  {

	  public ExtentReportListener() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	  public ExtentHtmlReporter htmlReporter;
	  public ExtentReports extent;
	  public ExtentTest logger;
	  
	   
	  public void onStart(ITestContext testContext)
	  {
	   htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/myReport.html");//specify location of the report
	   htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
	   
	   extent=new ExtentReports();
	   
	   extent.attachReporter(htmlReporter);
	   extent.setSystemInfo("Host name","localhost");
	   extent.setSystemInfo("Environemnt","QA");
	   extent.setSystemInfo("user","pavan");
	   
	   htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
	   htmlReporter.config().setReportName("Functional Testing"); // name of the report
	  // htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
	   htmlReporter.config().setTheme(Theme.STANDARD);
	  }
	  
	  public void onTestSuccess(ITestResult tr)
	  {
	   logger=extent.createTest(tr.getName()); // create new entry in th report
	   logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); // send the passed information to the report with GREEN color highlighted
	  }
	  
	  public void onTestFailure(ITestResult tr)
	  {
	   logger=extent.createTest(tr.getName()); // create new entry in th report
	   logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted
	   
	   String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
	   try {
	    logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
	   } catch (IOException e) {
	     e.printStackTrace();
	   } 
	  }
	  
	  public void onTestSkipped(ITestResult tr)
	  {
	   logger=extent.createTest(tr.getName()); // create new entry in th report
	   logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	  }
	  
	  public void onFinish(ITestContext testContext)
	  {
	   extent.flush();
	  }
	
}
