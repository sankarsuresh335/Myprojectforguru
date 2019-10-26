package gurupageobject;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Basecommanfuction.baseproperties;

public class Listern_testing implements ITestListener {

	baseproperties base = new baseproperties();

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		try {
			base.Screenshots(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
