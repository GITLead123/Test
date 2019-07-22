package ThirdRound.ThirdMaven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer {
	
	
		int min = 1;
		int max = 10;
		
	

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if (min <=max)
		{
			min ++;
			return true;
		}
		return false;
	}

}
