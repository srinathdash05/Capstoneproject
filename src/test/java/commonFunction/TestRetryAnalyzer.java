package commonFunction;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRetryAnalyzer implements IRetryAnalyzer{
	int count =1;
	int max = 3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<max) {
			count++;
			return true;
		}
		return false;
	}

}
