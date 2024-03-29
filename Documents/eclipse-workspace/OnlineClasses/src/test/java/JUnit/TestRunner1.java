package JUnit;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner1 {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestJUnit1.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
}
