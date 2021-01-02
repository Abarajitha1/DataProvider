package org.sample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuite {

	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(SuiteLevel.class);

		int runCount = runClasses.getRunCount();
		System.out.println(runCount);
		int failureCount = runClasses.getFailureCount();
		System.out.println(failureCount);

		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println(ignoreCount);

		long runTime = runClasses.getRunTime();
		System.out.println(runTime);
		List<Failure> failures = runClasses.getFailures();
		
		for (Failure failure : failures) {
			System.out.println(failure.toString());
		}
	}
}
