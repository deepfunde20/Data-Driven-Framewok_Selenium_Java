package listeners;



	import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
	import org.testng.TestListenerAdapter;
	
	
	
	
	public class TestngListnerAdapter implements  ITestListener {
	
		
		
		public void onTestStart(ITestResult tr) {
	  System.out.println("test is started");
	 }

	 public void onTestSuccess(ITestResult tr) {
	  System.out.println(" test is passed");
	 }

	 public void onTestFailure(ITestResult tr) {
	  System.out.println(" test is failed");
	 }

	 public void onTestSkipped(ITestResult tr) {
	  System.out.println(" test is skipped");
	 }

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	}

