package FailedTestcase.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2 {
	@Test()
	public void testcase2() {
		Assert.assertTrue(false);
		System.out.println("Twitter is working");
	}

}
