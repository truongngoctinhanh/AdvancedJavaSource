package JUnitTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(AllTests.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}

}
