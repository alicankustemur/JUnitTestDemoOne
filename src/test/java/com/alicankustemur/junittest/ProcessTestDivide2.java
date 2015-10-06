package com.alicankustemur.junittest;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.alicankustemur.main.Process;

public class ProcessTestDivide2 {

	public static Process process;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new Process();
	}

	@Test
	public void testDivide_true_10_1() {
		final int numberOne = 10;
		final int numberTwo = 1;
		final int trueResult = 10;

		process.setNumberOne(numberOne);
		process.setNumberTwo(numberTwo);

		final int result = process.divide();

		Assert.assertTrue("Error Results", result == trueResult);

	}
}
