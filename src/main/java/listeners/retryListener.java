package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryListener implements IRetryAnalyzer {

	int maxCount = 3;
	int counter =0;
	
	@Override
	public boolean retry(ITestResult result) {
		
			if (counter<maxCount) {
		
				counter++;
		
			return true;
		}
		
		
		return false;
	}


}
