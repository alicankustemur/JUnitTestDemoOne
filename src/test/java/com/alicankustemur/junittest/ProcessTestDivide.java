package com.alicankustemur.junittest;

import junit.framework.Assert;

import org.junit.Test;

import com.alicankustemur.main.Process;

public class ProcessTestDivide {

	@Test
	public void testDivide_true_10_2() {
		final int numberOne = 10;
		final int numberTwo = 2;
		final int trueResult = 5;

		final Process process = new Process(numberOne, numberTwo);
		final int result = process.divide();

		Assert.assertTrue("Error Results", result == trueResult);

	}
}
