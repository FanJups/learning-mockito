package com.tutorialspoint.mockito;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    @Test
    public void runningTests() {
	Result result = JUnitCore.runClasses(TestSuite.class);
	for (Failure failure : result.getFailures()) {
	    System.out.println(failure.toString());
	}
	System.out.println(result.wasSuccessful());
    }

}
